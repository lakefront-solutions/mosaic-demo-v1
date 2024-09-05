package com.app.mosaic;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.app.mosaic.Models.Message;
import com.app.mosaic.controllers.APIConfigs;
import com.app.mosaic.interfaces.OnAddToCartListener;
import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity implements OnAddToCartListener{
    List<Message> messages;
    List<Message> cartItems;
    MessageAdapter messageAdapter;
    ListView messageListView;
    Button sendButton;
    EditText messageInput;
    LinearLayout cartLayout;
    TextView cartCount;
    ImageButton cartButton;
    // Initialize OkHttpClient
    OkHttpClient client = new OkHttpClient();
    private ScrollView scrollView;
    private SpeechRecognizer speechRecognizer;
    private int numberOfRetries = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // cart items
        cartItems = new ArrayList<>();
        // Initialize the message list and adapter
        messages = new ArrayList<>();
        messages.add(new Message("Hello! How may I help?", null,null, getCurrentTime(), Message.TYPE_RESPONSE));

        initViews();
        messageAdapter = new MessageAdapter(this, messages, this);
        messageListView.setAdapter(messageAdapter);
    }

    private void initViews() {
        cartLayout = findViewById(R.id.cart_layout);
        cartCount = findViewById(R.id.cart_count);
        cartButton = findViewById(R.id.cart_button);
        messageListView = findViewById(R.id.message_list);
        sendButton = findViewById(R.id.send_button);
        messageInput = findViewById(R.id.message_input);

        // disable send button if message input is empty
        messageInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                sendButton.setEnabled(s.toString().trim().length() > 0);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        addTextToSpeech();

        sendButton.setOnClickListener(v -> {
            // get current date and time in the format "2024 JUL 11 12:00 PM"
            String sendTime = getCurrentTime();
            addMessage(messageInput.getText().toString(), null,null, sendTime, Message.TYPE_OUT);
            numberOfRetries = 0;
            sendMessageToApi(messageInput.getText().toString());
            messageInput.getText().clear();
        });

        // handle cart button click
        cartButton.setOnClickListener(v -> {
            // open cart activity and pass the cart items
            Intent intent = new Intent(this, CartActivity.class);
            // convert items to jsonArray and pass it to the cart activity
            JsonArray jsonArray = new Gson().toJsonTree(cartItems).getAsJsonArray();
            intent.putExtra("cartItems", jsonArray.toString());
            startActivity(intent);
        });
    }

    public void addMessage(String text, String url, String price, String time, int type) {
        messages.add(new Message(text , url, price , time, type));
        messageAdapter.notifyDataSetChanged();
    }

    private void sendMessageToApi(String messageText) {
        // change the message to include a return format as json
        String returnFormat = "\n give the response in as json array with at most 2 json objects." +
                "set artwork_url to empty if an item does not have one." +
                "response template: [{description: item_description, price: item_price, artwork_url: item_url}] " +
                "Notice: do not include unnecessary newlines.";
        String updatedMessageText = messageText + returnFormat;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    numberOfRetries++;
                    // Create JSON object to send in the request body
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("message", updatedMessageText);

                    // Convert JSON object to string
                    String json = new Gson().toJson(jsonObject);

                    // Create request body
                    RequestBody body = RequestBody.create(json, okhttp3.MediaType.parse("application/json"));

                    // Create POST request
                    Request request = new Request.Builder()
                            .url(APIConfigs.getChatEndpoint())
                            .post(body)
                            .build();

                    // Execute request and get response
                    Response response = client.newCall(request).execute();
                    if (response.isSuccessful()) {
                        String jsonResponse = response.body().string();
                        // convert the response to JSON object
                        List<Message> responseMessages = getResponseMessage(jsonResponse);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // Add the response message to the list
                                responseMessages.forEach((message) -> {
                                    messages.add(message);
                                });
                                messageAdapter.notifyDataSetChanged();
                            }
                        });
                    }
                } catch (SocketTimeoutException e) {
                    // Handle the error
                    // if timeout error retry the request after 2 seconds
                    if (numberOfRetries < 3) {
                        try {
                            Thread.sleep(2000);
                            sendMessageToApi(messageText);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    // Handle the timeout
                }catch (IOException e) {
                    // Handle the error
                    System.err.println("Request failed: " + e.getMessage());
                }
            }
        });
    }

    private String getCurrentTime() {
        return java.text.DateFormat.getDateTimeInstance().format(new java.util.Date());
    }

    private List<Message> getResponseMessage(String response){
        List<Message> messages = new ArrayList<>();
        try{
            JsonObject responseObject = new Gson().fromJson(response, JsonObject.class);
            JsonElement responseElement = responseObject.get("response");
            if(responseElement.isJsonArray()){
                JsonArray responseArray = responseElement.getAsJsonArray();
                responseArray.forEach((element) -> {
                    JsonObject singleResponseObject = element.getAsJsonObject();
                    Message message = new Message(singleResponseObject.get("description").getAsString(), singleResponseObject.get("price").getAsString() ,singleResponseObject.get("artwork_url").getAsString(), getCurrentTime(), Message.TYPE_RESPONSE);
                    messages.add(message);
                });
            }else if (responseElement.isJsonPrimitive()) {
                JsonArray responseArray = convertPrimitiveResponseToJsonArray(responseElement);
                responseArray.forEach((element) -> {
                    JsonObject singleResponseObject = element.getAsJsonObject();
                    Message message = new Message(singleResponseObject.get("description").getAsString(), singleResponseObject.get("price").getAsString() ,singleResponseObject.get("artwork_url").getAsString(), getCurrentTime(), Message.TYPE_RESPONSE);
                    messages.add(message);
                });
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            Message message = new Message("I'm sorry, I couldn't find any items matching your query.", null, null, getCurrentTime(), Message.TYPE_RESPONSE);
            messages.add(message);
        }finally {
            return messages;
        }
    }

    private JsonArray convertPrimitiveResponseToJsonArray(JsonElement responseElement){
        // Remove any unnecessary formatting (newlines, etc.)
        String jsonString = responseElement.getAsString().replaceAll("\\\\n", "").trim();

        // Convert the cleaned string to a JsonObject
        return new Gson().fromJson(jsonString, JsonArray.class);
    }

    private void addTextToSpeech() {
        // Add text to speech functionality here
        speechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
        speechRecognizer.setRecognitionListener(new RecognitionListener() {
            @Override
            public void onReadyForSpeech(Bundle params) {}
            @Override
            public void onBeginningOfSpeech() {}
            @Override
            public void onRmsChanged(float rmsdB) {}
            @Override
            public void onBufferReceived(byte[] buffer) {}
            @Override
            public void onEndOfSpeech() {}
            @Override
            public void onError(int error) {}
            @Override
            public void onResults(Bundle results) {
                ArrayList<String> data = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                if (data != null && !data.isEmpty()) {
                    Toast.makeText(MainActivity.this, data.get(0), Toast.LENGTH_SHORT).show();
                    messageInput.setText(data.get(0));
                }
            }
            @Override
            public void onPartialResults(Bundle partialResults) {}
            @Override
            public void onEvent(int eventType, Bundle params) {}
        });

        // Start speech recognition intent
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        speechRecognizer.startListening(intent);
    }

    @Override
    public void onAddToCart(Message message) {
        // open add to cart dialog
        openAddToCartDialog(message);
    }

    // open add to cart dialog and add item to cart if user confirms
    public void openAddToCartDialog(Message message) {
        // open dialog with item details and add to cart button and cancel button
        Dialog dialog = new Dialog(this);
        // adjust dialog layout
        dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        dialog.setContentView(R.layout.dialog_add_to_cart);
        // set the image
        ImageView image = dialog.findViewById(R.id.dialog_add_to_cart_image);
        if (message.getImageUrl() != null) {
            Glide.with(getApplicationContext()).load(message.getImageUrl()).into(image);
        }
        // set the message details
        TextView description = dialog.findViewById(R.id.dialog_add_to_cart_details);
        description.setText(message.getDetails());

        // handle add to cart button
        dialog.findViewById(R.id.dialog_add_to_cart_button).setOnClickListener(v -> {
            // add item to cart
            cartItems.add(message);
            if(cartItems.size() > 0) {
                cartCount.setText(String.valueOf(cartItems.size()));
                cartLayout.setVisibility(View.VISIBLE);
            }
            // show cart layout
            dialog.dismiss();
        });

        // handle cancel button
        dialog.findViewById(R.id.dialog_add_to_cart_cancel).setOnClickListener(v -> {
            // close dialog
            dialog.dismiss();
        });

        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        speechRecognizer.destroy();
    }
}