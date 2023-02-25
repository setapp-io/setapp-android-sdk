# setapp
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.setapp/setapp/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.setapp/setapp)
[![Build](https://github.com/setapp-io/setapp-android-sdk/actions/workflows/ci.yml/badge.svg)](https://github.com/setapp-io/setapp-android-sdk/actions/workflows/ci.yml)

Setapp is an android application that lets you change the behavior and appearance of your app without requiring a rebuilt app. When using the setapp client library, you call settings with in-app default values that control the behavior and appearance of your app. Then, you can later use the [setapp application](https://play.google.com/store/apps/details?id=io.setapp.android) to override in-app default values for the app. See the [project website](https://setapp.io/) for documentation.

<p align="center">
  <img src="https://setapp.io/images/workflow.gif" alt="setapp demo"/>
</p>

To set up setapp SDK for Android, you need to add the necessary dependencies to your app.

## Dependencies

Setapp is distributed through [***mavenCentral***](https://search.maven.org/artifact/io.setapp/setapp). To use it, you need to add the
following to your project's root `build.gradle` file

```groovy
repositories {
    mavenCentral()
}
```

Add the following to your project's `build.gradle` file

```groovy
dependencies {
    debugImplementation "io.setapp:setapp:${setapp_version}"
    releaseImplementation "io.setapp:setapp-noop:${setapp_version}"
}
```

> Please note that our `io.setapp:setapp-noop` package provides empty implementations.

## Usage

For getting value from setapp application just cal one of the following methods.

#### Get int value

```kotlin
val value: Int = Settings.getInt("YOUR_KEY_HERE", -1)
val value: Int? = Settings.getIntOrNull("YOUR_KEY_HERE")
```

#### Get long value

```kotlin
val value: Long = Settings.getLong("YOUR_KEY_HERE", -1L)
val value: Long? = Settings.getLongOrNull("YOUR_KEY_HERE")
```

#### Get float value

```kotlin
val value: Float = Settings.getFloat("YOUR_KEY_HERE", -1F)
val value: Float? = Settings.getFloatOrNull("YOUR_KEY_HERE")
```

#### Get string value

```kotlin
val value: String = Settings.getString("YOUR_KEY_HERE", "")
val value: String? = Settings.getStringOrNull("YOUR_KEY_HERE")
```

#### Get boolean value

```kotlin
val value: Boolean = Settings.getBoolean("YOUR_KEY_HERE", false)
val value: Boolean? = Settings.getBooleanOrNull("YOUR_KEY_HERE")
```
