# CircleAccessLock

CircleAccessLock is a simple Android library for displaying a lock screen usign Circle Technology in your application. It is built in Kotlin and distributed as an AAR file.

## Features

- Displays a WebView with a configurable URL
- Allows users to interact with the WebView to perform authentication or other actions
- Automatically locks the app when the user leaves or when the app becomes inactive
- Can be enabled or disabled programmatically

## Installation

1. Download the `your-library.aar` file from the `library` folder in this repository.
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
import com.example.yourlibrary.CircleAccessLock
```

2. Initialize a CircleAccessLock object in your `MainActivity` or any other `Activity` where you want to show the lock screen:

```kotlin
val circleAccessLock = CircleAccessLock(this)
```

3. Optionally, you can provide an initial URL for the lock screen:

```kotlin
val circleAccessLock = CircleAccessLock(this, initialUrl = "https://your-custom-url.com")
```

4. To enable or disable the lock screen, use the following methods:

```kotlin
circleAccessLock.enable()
circleAccessLock.disable()
```

## Sample App

A sample app is provided in the `sample` folder to demonstrate how to integrate and use CircleAccessLock in your Android project.

## License

[MIT License](LICENSE)
