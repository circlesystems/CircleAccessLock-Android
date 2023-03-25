# CircleAccessLock

CircleAccessLock is a simple Android library for displaying a lock screen using Circle Technology in your application. It is built in Kotlin and distributed as an AAR file.

## Features

- Automatically locks the app when the user leaves or when the app becomes inactive
- Can be enabled or disabled programmatically

## Installation

1. Download the `CircleAccessLock.aar` file from the `library` folder in this repository.
2. Copy the AAR file to the `libs` folder in your Android project. If the folder doesn't exist, create it.
3. Add the following code to your app's `build.gradle` file:

```groovy
repositories {
    flatDir {
        dirs 'libs'
    }
}

dependencies {
    implementation files('libs/CircleAccessLock.aar')
}
```

## Usage

To use CircleAccessLock in your Android project, follow these steps:

1. Import the library in your Kotlin or Java code:

```kotlin
import ai.circlesecurity.circleaccesslock.CircleAccessLock
```

2. Initialize a CircleAccessLock object in your `MainActivity` or any other `Activity` where you want to show the lock screen:

```kotlin

class MainActivity : AppCompatActivity() {

    private lateinit var circleAccessLock: CircleAccessLock

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circleAccessLock = CircleAccessLock(this)
        circleAccessLock.onCreate()
    }

}
```

3. Open the ```AndroidManifest.xml``` file in your app's ```src/main``` directory. Add the ```CircleActivity``` declaration inside the ```<application>``` tag::

```xml
<activity
    android:name="ai.circlesecurity.circleaccesslock.CircleActivity"
    android:exported="false" />
```

4. To enable or disable the lock screen, use the following methods:

```kotlin
circleAccessLock.enable()
circleAccessLock.disable()
```

5. Remember to add the access internet permission to the ```AndroidManifest.xml``` file before the ```<application>```

```xml
 <uses-permission android:name="android.permission.INTERNET" />
 ```

## Sample App

A sample app is provided in the `sample` folder to demonstrate how to integrate and use CircleAccessLock in your Android project.

## License

[MIT License](LICENSE)
