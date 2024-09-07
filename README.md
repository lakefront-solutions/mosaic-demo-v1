# mosaic-demo-v1
Pizza ordering Android App Demo 1
<a id="readme-top"></a>
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#introduction-to-android-development">Introduction to Android Development</a>
        <ul>
          <li>What is Android?</li>
          <li>Overview of the Android ecosystem</li>
          <li>The role of Java in Android development</li>
        </ul>
    </li>
    <li>
      <a href="#prerequisites-for-android-app-development">Prerequisites for Android App Development</a>
      <ul>
          <li><a href="#basic-programming-knowledge">Basic Programming Knowledge</a></li>
          <li><a href="#development-environment">Development Environment</a></li>
        </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#understanding-android-project-structure">Understanding Android Project Structure</a></li>
        <li><a href="#understanding-android-components">Understanding Android Components</a></li>
        <li><a href="#basic-ui-design">Basic UI Design</a></li>
        <li><a href="#working-with-data">Working with Data</a></li>
        <li><a href="#understanding-android-activity-lifecycle">Understanding Android Activity Lifecycle</a></li>
        <li><a href="#introduction-to-java-for-android">Introduction to Java for Android</a></li>
        <li><a href="#what-is-an-interface">What is an Interface?</a></li>
      </ul>
    </li>
    <li><a href="#building-the-pizza-search-app">Building the Pizza Search App</a></li>
    <li><a href="#testing-and-debugging">Testing and Debugging</a></li>
    <li><a href="#deploying-your-app">Deploying Your App</a></li>
    <li><a href="#final-app-demo">Final App Demo</a></li>
    <li><a href="#garbage-collection">Android Garbage Collection</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

<div style="display: flex; align-items: center;">
  <img src="https://github.com/user-attachments/assets/b0690db7-545e-4490-8a57-00a8c444b17b" alt="mosaic-app" height="300" width="150" style="margin-right: 10px;"/>
  <p>This project serves as a comprehensive guide for individuals seeking to embark on Android development. It offers foundational knowledge essential for beginners, covering key concepts, tools, and best practices in Android application development. Additionally, the project delves into the integration of artificial intelligence (AI) within Android applications, providing insights and practical examples to enhance your understanding of AI implementation. By the end of this project, you will have a solid grasp of Android development and the ability to leverage AI technologies to create innovative and intelligent applications.</p>
</div>

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

This section lists the major frameworks/libraries used to for building this project.

* [<img src="https://github.com/user-attachments/assets/c3b4c089-60f2-41dc-90de-16c7a5a29c43" alt="Android" width="24"/>](https://en.wikipedia.org/wiki/Android_software_development) Android
* [<img src="https://github.com/user-attachments/assets/ee76c9f1-dddd-4a48-8110-af76965c1e97" alt="Java" width="24"/>](https://en.wikipedia.org/wiki/Java_programming_language) Java
* [<img src="https://github.com/user-attachments/assets/7ff366e0-e7b1-4ae2-8aa4-a088fa7f499f" alt="AI" width="24"/>](https://en.wikipedia.org/wiki/Artificial_intelligence) Artificial intelligence

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Introduction to Android Development
- Android operating system is the largest installed base among various mobile platforms across the globe. [BACKLINKO](https://backlinko.com/iphone-vs-android-statistics#)
  * As of early 2024, Android has a 70.69% market share worldwide.
  * In the US, iPhones hold a market share of 60.77%.
  * More 3 billion Android devices are currently active.
  * Android smartphones accounted for 56% of all smartphone sales worldwide in Q4 2023.
    
- History
  * Android was created by the [Open Handset Alliance](https://en.wikipedia.org/wiki/Open_Handset_Alliance), which is led by Google.
  * On August 18, 2008, the Android 0.9 SDK beta was released
  * On December 5, 2008, Google announced the first Android Dev Phone.
    
- Android OS components:
  * __Linux Kernel:__
    The core of the Android operating system is based on the Linux kernel, which is written in C and C++
  * __Native Libraries:__
    Many core components and services of the Android system are built using native code written in C and C++. These native libraries provide essential functionalities and are exposed to developers through Java APIs.
  * __Android Runtime (ART):__
    The Android Runtime (ART) and its predecessor, Dalvik, are responsible for running Android applications. These runtimes execute bytecode compiled from __Java source code__ or __Kotlin__
  * __Java API Framework:__
    The higher-level APIs and application framework are written in Java. This allows developers to write Android applications using Java, which are then compiled into bytecode and run on the Android Runtime
    
- Android operating system is [open source](https://en.wikipedia.org/wiki/Open_source).
  * Freely available for possible modification and redistribution.
  * [CyanogenMod](https://en.wikipedia.org/wiki/CyanogenMod) is one of the popular open source Android redistributions. 
  * Limitations: Closed-source Google applications such as [Google Play](https://en.wikipedia.org/wiki/Google_Play) and google GPS navigation.
  
- Role of Java in Android development.
  Java 
  Java is one of the preferred langugages for android developments and that is because:
  * __JAVA is an Object-Oriented Programming (OOP):__
    Java’s OOP principles make it easier to manage and maintain complex codebases. This modular approach allows developers to create reusable and scalable code.
  * __Platform Independence:__
    Java’s “Write Once, Run Anywhere” capability ensures that code written in Java can run on any device that supports the Java Virtual Machine (JVM). This cross-platform compatibility is a significant advantage for Android development
  * __Robust and Secure:__
    Java is known for its robustness and security features. It includes strong memory management, exception handling, and a comprehensive security framework, making it ideal for developing secure Android applications
  * __Extensive Libraries and Tools:__
    Java offers a rich set of libraries and development tools that simplify the development process. These libraries provide pre-built functionalities, reducing the need to write code from scratch
  * __Performance:__
    Java’s performance is optimized for Android development. The Just-In-Time (JIT) compiler and efficient garbage collection contribute to the smooth performance of Android applications1.
  * __Existing Developer Base:__
    Java was already a widely-used and well-known programming language with a large community of developers. This meant that there was a ready pool of talent familiar with Java, making it easier for Google to attract developers to the Android platform2.
  * __Sun Microsystems’ Support:__
    At the time, Sun Microsystems, the original creator of Java, actively encouraged the adoption of Java and had an agreement with Google to use Java for Android. This support was a significant factor in Google’s decision

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Prerequisites for Android App Development
### Basic Programming Knowledge:
  * Familiarity with programming concepts and languages such as Java or Kotlin.
  * Understanding of object-oriented programming (OOP) principles.
  * Basic understanding of XML (eXtensible Markup Language) for designing user interfaces in Android
  * Basic [MVC Knowledge](https://www.codecademy.com/article/mvc) (Model View Controller)
    <img src="https://github.com/user-attachments/assets/38805229-a71a-4ac5-8a6c-d2571b8b0cc7" alt="MVC" width="300" height="300"/>
    
### Development Environment:
  This is a nice youtube video tutorial for installing Android Studio: [Android Studio + SDK Configs](https://www.youtube.com/watch?v=4pCBPbdHARE)
  * __Android Studio:__ Download and install the latest version of [Android Studio](https://developer.android.com/studio?gad_source=1&gbraid=0AAAAAC-IOZlrnNqQZGfEfs8BT0KNNN9rC&gclid=CjwKCAjwreW2BhBhEiwAavLwfOodAVfTgxfGKxwF1xm20wcf83NgQYcQ4crQPx7KyOkW2rQM0TWWFRoCGPQQAvD_BwE&gclsrc=aw.ds), the official Integrated Development Environment (IDE) for Android development.
  * __Android SDK:__ when prompted, install the Android Software development Kit (SDK). Android SDK is a collection of libraries and Software Development tools that are essential for Developing Android Applications. Whenever Google releases a new version or update of Android Software, a corresponding SDK also releases with it. You may also install newer versions by doing these steps:
    - Open Android Studio -> Click on Tools -> Click on SDK Manager and install any version of your choice.
  * __Setting up an Emulator:__
    - Click on Tools -> Device Manager -> Add new Device -> create virtual device
    - Follow the prompts.
   
  * __Using a Physical Device:__
    Alternatively, you can use a physical Android device for testing by enabling Developer Options and USB Debugging.
    - Click on settings -> About ...
    - rapidly tap Build number seven times in a row (A popup message will appear when you are close to enabling the mode)
    - Go to developer options and enbale USB Debugging. 

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started
### Understanding Android Project Structure
  * __App Module:__
    The main module containing your app’s source code, resources, and app-level settings like the __AndroidManifest.xml__ and __build.gradle files__. When you create a new project, the default app module is named “app”
  * __Library Module:__
    __(Project View Mode): External Libraries__
    Contains reusable code that can be used as a dependency in other app modules or projects. It generates an Android Archive (AAR) file
  * __Project Files:__
    - __build.gradle:__ The root build file containing plugin declarations and common configurations for all subprojects.
    - __settings.gradle:__ Contains global build information, including project names and subprojects to include.
    - __local.properties:__ Contains properties related to the local machine, such as the Android SDK location (excluded from source control), you may also add your api keys here.
  * __Directory Structure__:
    - __src/main/AndroidManifest.xml:__ Declares essential information about your app, including components and permissions.
    - __src/main/java:__ Contains the Java or Kotlin source code for your app.
    - __src/main/res:__ Contains resource files like layouts, drawables, and strings.
      
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Understanding Android Components
  * __Activities:__
  Activities represent a single screen with a user interface. They are the entry point for interacting with the user. Fragments have their own lifecycle, which is closely tied to the lifecycle of the host activity. This allows for better control over the UI components and their state management.
  ```sh
  public class MainActivity extends AppCompatActivity {
    // Code for the activity
  }
  ```
  * __Fragments:__
  Fragments introduce modularity into your app’s UI by letting you divide the UI into discrete chunks. This makes it easier to manage and reuse components across different parts of your app.
  ```sh
  FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
  transaction.replace(R.id.fragment_container, new ExampleFragment());
  transaction.addToBackStack(null);
  transaction.commit();
  ```
  * __Services:__
    Services run in the background to perform long-running operations or to perform work for remote processes.
    Example: A music player app might use a service to play music in the background while the user is in a different app
  ```sh
  public class MusicService extends Service {
    // Code for the service
  }
  ```
  * __Content Providers:__
    Content providers manage access to a structured set of data. They encapsulate the data and provide mechanisms for defining data security. In short, a Content Provider is Andoid's way of allowing apps to share their data with other apps
    Example: An app that stores user contacts might use a content provider to manage contact data.
  ```sh
  public class ContactsProvider extends ContentProvider {
    // Code for the provider
  }
  ```
  * __Broadcast Receivers:__
    Broadcast receivers respond to system-wide broadcast announcements. They enable the app to listen for specific broadcast messages from the system or other apps.
    Example: An app might use a broadcast receiver to detect when the device low battery.
  ```sh
  batteryLevel = new BatteryLevel();
  mContext.registerReceiver(batteryLevel, new IntentFilter(Intent.ACTION_BATTERY_LOW));
  ```
  * __Intents:__
    Intents are messaging objects used to request an action from another app component. They facilitate communication between different components.
    Example: An intent can be used to start a new activity or to send a broadcast. 
  ```sh
  Intent intent = new Intent(this, NewActivity.class);
  startActivity(intent);
  ```
  * __Layouts:__
    Layouts are containers that hold and arrange views in a specific manner. They define the structure and positioning of the UI components
    Common Layouts:
    * LinearLayout: Arranges views in a single row or column.
    * RelativeLayout: Positions views relative to each other or the parent container.
    * ConstraintLayout: A flexible layout that allows you to create complex layouts with a flat view hierarchy.
    * FrameLayout: A simple layout that stacks views on top of each other.
    * GridLayout: Arranges views in a grid format.
    * Layout Editor:
Use the Layout Editor in Android Studio to visually design your UI. Drag and drop UI components from the palette, and configure their properties using the attributes panel

  * __Views:__
    Views are the basic building blocks of an Android user interface. They represent the UI components that users interact with, such as buttons, text fields, images, and more1.
  Common Views:
    * TextView: Displays text to the user.
    * Button: A clickable button.
    * ImageView: Displays an image.
    * EditText: A text field for user input.
    * ListViews
    * RecyclerView: A flexible view for displaying large data sets in a scrollable list.
    * __ListViews and Adapters:__
      ListViews are android elements used to display items in a list. 
      Adapters are used to bind an array of data to a ListView. It is a simple adapter that can handle a single list of items.
    ```sh
    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataArray);
    listView.setAdapter(adapter);
    ```
    ```sh
    public class CustomAdapter extends BaseAdapter {
      // Implementation of custom adapter
    }
    ```
### Basic UI Design:
  * __XML Layouts: Designing with XML.__
    ```sh
    <LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, World!" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Click Me" />
    </LinearLayout>
    ```
  * __Introduction to Material Design principles:__
    [Material Design](https://m3.material.io) is a design system developed by Google to create high-quality digital experiences across various platforms, including Android, iOS, Flutter, and the web. It is inspired by the physical world and its textures, incorporating principles from print design to create a cohesive and immersive user experience12.
  Using Material design
    * Add Material Components to your project: Open your build.gradle file and add the following dependency:
    ```sh
    implementation 'com.google.android.material:material:1.4.0'
    ```
    * Update your app theme:
    ```sh
    <style name="AppTheme" parent="Theme.MaterialComponents.DayNight.DarkActionBar">
        <!-- Customize your theme here. -->
        <item name="colorPrimary">@color/primary</item>
        <item name="colorPrimaryVariant">@color/primaryVariant</item>
        <item name="colorOnPrimary">@color/onPrimary</item>
        <item name="colorSecondary">@color/secondary</item>
    </style>
    ```
    * Use Material Components in your layouts. Example material button
    ```sh
    <com.google.android.material.button.MaterialButton
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Material Button" />
    ```
  * __Handling User inputs: Example Button.__

    __XML__
    ```sh
    <com.google.android.material.button.MaterialButton
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Material Button" />
    ```
    __JAVA__
    ```sh
    MaterialButton button = findViewById(R.id.materialButton);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Handle button click
        }
    });
    ```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Working with Data
  * __Managing data using SharedPreferences:__
    SharedPreferences is a simple way to store small amounts of data as key-value pairs.
    
    __Get a SharedPreferences instance:__
    ```sh
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
    ```
    __Save data to SharedPreferences:__
    ```sh
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("key", "value");
        editor.apply();
    ```
    __Retrieve data from SharedPreferences:__
    ```sh
        String value = sharedPreferences.getString("key", "default_value");
    ```

  * __Basics of Networking in Android (Using REST APIs)__
    - Android permission Intro
      ```sh
        <uses-permission android:name="android.permission.INTERNET" />
      ```
    - Retrofit
    - OkHttp3
      Using OkHttp3:
      __add the OkHttp3 dependency to your build.gradle file:__
      ```sh
        implementation 'com.squareup.okhttp3:okhttp:4.9.1'
      ```
      __Make Network Requests__
      You can make both synchronous and asynchronous network requests using OkHttp3. Here’s an example of how to perform a GET request:
      
      __synchronous Get Request__
      ```sh
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url("https://api.example.com/data")
            .build();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                String responseData = response.body().string();
                // Handle the response
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      ```
      __asynchronous Get Request__
      ```sh
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
            .url("https://api.example.com/data")
            .build();
        
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }
        
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    // Handle the response
                }
            }
        });
      ```
      
 <p align="right">(<a href="#readme-top">back to top</a>)</p>

### Understanding Android Activity Lifecycle
  * __onCreate()__
    * __Called when:__ The activity is first created.
    * __Purpose:__ Initialize the activity. This is where you should perform one-time setup procedures, such as creating the UI, initializing variables, and binding data to lists.
    * __Example:__
       ```sh
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            // Initialize components here
        }
      ```
       
  * __onStart()__
    * __Called when:__ The activity becomes visible to the user.
    * __Purpose:__ Prepare the activity to enter the foreground and become interactive.
    * __Example:__
       ```sh
        @Override
        protected void onStart() {
            super.onStart();
            // Perform tasks to make the activity visible
        }
      ```
  * __onResume()__
    * __Called when:__ The activity starts interacting with the user.
    * __Purpose:__ Resume any paused UI updates, animations, or other ongoing actions.
      ```sh
          @Override
          protected void onResume() {
              super.onResume();
              // Resume interactions with the user
          }
      ```
  * __onDestroy()__
    * __Called when:__ The activity is about to be destroyed.
    * __Purpose:__ Clean up any resources, such as threads or database connections, that need to be released.
      ```sh
          @Override
          protected void onDestroy() {
              super.onDestroy();
              // Clean up resources
          }
      ```

## Introduction to Java for Android
### Basic Java concepts relevant to Android development (OOP, classes, methods)
  *  __Object-Oriented Programming (OOP)__
    OOP is a programming paradigm based on the concept of “objects,” which can contain data and code. The main principles of OOP are:
    * __Encapsulation:__ Bundling data (fields) and methods (functions) that operate on the data into a single unit, or class.
    * __Inheritance:__ Creating new classes based on existing ones, allowing for code reuse and the creation of a hierarchical relationship between classes.
    * __Polymorphism:__ Allowing objects to be treated as instances of their parent class rather than their actual class, enabling one interface to be used for a general class of actions.
    * __Abstraction:__ Hiding the complex implementation details and showing only the necessary features of an object.

  * __Classes and Objects__
    * __Class:__
      A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.
      ```sh
          public class Car {
              // Fields
              private String color;
              private String model;
          
              // Constructor
              public Car(String color, String model) {
                  this.color = color;
                  this.model = model;
              }
          
              // Methods
              public void displayInfo() {
                  System.out.println("Car model: " + model + ", Color: " + color);
              }
          }
      ```
    * __Object:__
      An instance of a class. It is created using the new keyword
      ```sh
          Car myCar = new Car("Red", "Toyota");
          myCar.displayInfo(); // Output: Car model: Toyota, Color: Red
      ```
  * __Methods:__
    Methods are functions defined within a class that describe the behaviors of the objects created from the class.
    ```sh
          public class Calculator {
              // Method to add two numbers
              public int add(int a, int b) {
                  return a + b;
              }
          
              // Method to subtract two numbers
              public int subtract(int a, int b) {
                  return a - b;
              }
          }
    ```
  * __Relevance to Android Development__
    * __Activities:__ (Inheritance) In Android, an activity represents a single screen with a user interface. Each activity is implemented as a subclass of the Activity class.
    * __XML Layouts:__ (Abstraction & )Define the UI elements and their properties. These layouts are linked to activities.
    * __Intents:__ Used to start activities or communicate between components.
    * __AsyncTask:__ (Abstraction) Helps in performing background operations and updating the UI thread.
  * __Event handling in Android.__
    Event handling in Android involves managing user interactions with the app’s UI components. Here are the key concepts and methods you need to know:
    * __Event Listeners and Handlers__
      Event listeners are interfaces in the View class that contain callback methods. These methods are called when the user interacts with the UI component to which the listener is registered. Event handlers are the methods that handle these events.
      __Common Event Listeners and Handlers:__
      * __OnClickListener__
      * __OnLongClickListener__
  * __What is an Interface?__
    An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are used to specify a set of methods that a class must implement.
    * __Creating an Interface__
      ```sh
          public interface MyInterface {
              void myMethod();
          }
      ```
    * __Implementing an Interface__
      A class that implements an interface must provide implementations for all the methods declared in the interface:
      ```sh
          public class MyClass implements MyInterface {
              @Override
              public void myMethod() {
                  // Implementation of myMethod
              }
          }
      ```
    * __Common Use Cases in Android__
      * __Event Handling:__ example: __OnClickListener__
      * __Callbacks:__
        Interfaces are used to create callback methods. For example, you might define an interface to handle communication between a fragment and its parent activity.

## Building the Pizza Search App:
  * Step-by-step walkthrough of the app's key features.
  * Using an API and AI to search for pizza.

## Testing and Debugging:
  * Using the Android Emulator.
  * Debugging common issues

## Deploying Your App
  * Running your app on a physical device.
  * Publishing basics (introduction to Google Play Store). [Youtube](https://www.youtube.com/watch?v=5GHT4QtotE4)
    * __Create a Developer Account:__ Sign up for a developer account on the Google Play Console.
    * __Prepare Your App for Release:__ Build a release version of your app.
    * __Store Listing:__ Provide details like app title, description, screenshots, and promotional graphics.
    * __App Release:__ Choose how you want to release your app (alpha, beta, or production).
    * __Content Rating:__ Complete the content rating questionnaire.
    * __Pricing & Distribution:__ Set the price and distribution options.
    * __App Content:__ Add any additional content like in-app purchases or ads.
    * __App Releases:__ Upload the APK file and publish your app

## Final App Demo
  * Demonstrating the pizza search app in action.
  * Discussing potential enhancements and next steps.
    * In App purchase: (Google Pay | Credit Cards | Orange Money | etc)
    * Clear cart
    * allow users to complete all app actions using their voice.
   
## Android Garbage Collection [Nice Article by Augusto Herbel](https://proandroiddev.com/collecting-the-garbage-a-brief-history-of-gc-over-android-versions-f7f5583e433c)
  * __Introduction to Garbage Collection (GC)__
    * GC is a form of automatic memory management.
    * The primary goal is to reclaim memory occupied by objects that are no longer in use.
  * Evolution of GC in Android
    * __Dalvik VM:__ Early versions of Android used Dalvik VM, which had a simple GC mechanism.
    * __ART (Android Runtime):__ Replaced Dalvik in Android 5.0 (Lollipop) with more efficient GC algorithms.
  * GC Algorithms
    * __Mark-and-Sweep:__ Identifies and marks live objects, then sweeps through to reclaim memory from unmarked objects.
    * __Generational GC:__ Divides objects into generations (young and old) to optimize GC performance.
  * GC Triggers
    * GC can be triggered by various events, such as memory allocation failures or reaching a predefined memory limit.
  * Impact on Performance
    * GC can cause pauses in application execution, leading to performance issues like jank (unresponsive UI).
    * Optimizations in ART aim to minimize these pauses and improve overall performance.
  * Best Practices for Developers
    * Minimize object creation and reuse objects when possible.
      __Best Practice:__ Avoid creating unnecessary objects to reduce the workload on the garbage collector.
      __Example:__ Instead of creating a new String object in a loop, use a StringBuilder to concatenate strings.
      ```sh
          // Inefficient
          for (int i = 0; i < 1000; i++) {
              String result = "Number: " + i;
          }
          
          // Efficient
          StringBuilder builder = new StringBuilder();
          for (int i = 0; i < 1000; i++) {
              builder.append("Number: ").append(i);
          }
          String result = builder.toString();
      ```
      ```sh
          // Inefficient
          Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
          
          // Efficient
          Bitmap bitmap = bitmapPool.get(width, height, Bitmap.Config.ARGB_8888);
      ```
    * Use memory profiling tools to identify and fix memory leaks.
      __Best Practice:__ Regularly use memory profiling tools to identify and fix memory leaks.
      __Example:__ Use Android Studio’s Memory Profiler to monitor your app’s memory usage and detect memory leaks.
      __View -> Tool Windows -> Profiler__ the select the memory usage
    * Avoid Memory Leaks
      __Best Practice:__ Ensure that objects are not unintentionally retained, leading to memory leaks.
      __Example:__ Use __WeakReference__ for objects that should not prevent garbage collection.
      ```sh
          BitmapFactory.Options options = new BitmapFactory.Options();
          options.inSampleSize = 4; // Downsample by a factor of 4
          Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.large_image, options);
      ```
    * Avoid Using Static References
      __Best Practice:__ Avoid using static references to prevent memory leaks.
      __Example:__ Instead of using a static reference to an __Activity__, use a __WeakReference__.
      ```sh
          // Inefficient
          private static Activity activity;
          
          // Efficient
          private static WeakReference<Activity> activityRef;
      ```

  ## 
