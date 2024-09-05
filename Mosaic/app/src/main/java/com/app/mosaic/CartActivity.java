package com.app.mosaic;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.app.mosaic.Models.Message;

import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    ListView listView;
    Button proceedToCheckout;
    Button cancel;
    ArrayList<Message> cartItems = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_layout);
        initView();
        // get cart items from the passed intent
        Intent intent = getIntent();
        String cartItemsString = intent.getStringExtra("cartItems");
        System.out.println(cartItemsString);
        if (!cartItemsString.isEmpty()) {
            // convert string to array list
            cartItems = new Gson().fromJson(cartItemsString, new TypeToken<ArrayList<Message>>(){}.getType());
        }
        // set adapter
        listView.setAdapter(new CartAdapter(this, cartItems));
    }

    private void initView(){
        listView = findViewById(R.id.cart_list);
        proceedToCheckout = findViewById(R.id.cart_layout_proceed);
        cancel = findViewById(R.id.cart_layout_cancel);

        // handle proceed to checkout button click
        proceedToCheckout.setOnClickListener(v -> {
            // handle proceed to checkout
        });

        // handle cancel button click
        cancel.setOnClickListener(v -> {
            // return to the main activity
            finish();
        });

    }
}