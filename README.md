# SetApp

To set up SetApp SDK for Android, you need to add the necessary dependencies to your app.

## Dependencies

Setapp is distributed through [***
mavenCentral***](https://search.maven.org/artifact/io.setapp/setapp). To use it, you need to add the
following to your project's root `build.gradle` file

```groovy
repositories {
    maven {
      mavenCentral()
    }
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
val intValue = SetappSettings.getInt("YOUR_KEY_HERE", -1)
```

#### Get long value

```kotlin
val longValue = SetappSettings.getLong("YOUR_KEY_HERE", -1L)
```

#### Get float value

```kotlin
val floatValue = SetappSettings.getFloat("YOUR_KEY_HERE", -1F)
```

#### Get string value

```kotlin
val stringValue = SetappSettings.getString("YOUR_KEY_HERE", "")
```

#### Get boolean value

```kotlin
val booleanValue = SetappSettings.getBoolean("YOUR_KEY_HERE", false)
```