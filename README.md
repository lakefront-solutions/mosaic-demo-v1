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
        <li><a href="#understanding-android-components">Understanding Android Components</a></li>
        <li><a href="#basic-ui-design">Basic UI Design</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
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
  Activities represent a single screen with a user interface. They are the entry point for interacting with the user.
  ```sh
  public class MainActivity extends AppCompatActivity {
    // Code for the activity
  }
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

<p align="right">(<a href="#readme-top">back to top</a>)</p>
