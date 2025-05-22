## News Application - Jetpack Compose Clean Architecture Example

News app is an example for show news using https://thenewsapi.com API, built with Jetpack Compose.The goal of the sample is to showcase the current UI capabilities of Compose. Design pattern: Clean Architecture & MVVM


## Features

The example shows current news from thenewsapi and other information such as:
   * Newsfeed
   * Bookmark article
   * View article detail
## Data-Flow

![data-flow](https://github.com/user-attachments/assets/1b3ebc02-05ba-4270-a356-fa7c840a117e)


## Tech Stack & Architecture

* **Core:**
    * [Kotlin](https://kotlinlang.org/): Primary programming language.
    * [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html): For asynchronous programming and managing background tasks.
    * [Kotlin Flows](https://kotlinlang.org/docs/flow.html): Used extensively for reactive data streams, particularly with Room and network responses.

* **Dependency Injection:**
    * [Hilt](https://dagger.dev/hilt/): For managing dependencies throughout the application, simplifying DI in Android.

* **User Interface (UI):**
    * [Jetpack Compose](https://developer.android.com/jetpack/compose): For building the native UI declaratively with Kotlin.
    * [Material 3](https://m3.material.io/): Implementing Material Design components and theming.
    * [Compose Navigation](https://developer.android.com/jetpack/compose/navigation): For handling navigation between screens in a Compose-first way.
    * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel): Part of Jetpack, used to store and manage UI-related data in a lifecycle-conscious way.
    * [Coil](https://coil-kt.github.io/coil/compose/): For image loading in Jetpack Compose, optimized for Kotlin and Coroutines.

* **Networking:**
    * [Retrofit](https://square.github.io/retrofit/): For type-safe HTTP client and consuming RESTful APIs.
    * [OkHttp](https://square.github.io/okhttp/): As the underlying HTTP client for Retrofit, providing interceptors for logging and request modification.
    * [Gson](https://github.com/google/gson): For JSON serialization and deserialization.

* **Data & Storage:**
    * [Room](https://developer.android.com/training/data-storage/room): For local database persistence (likely for bookmarks or caching).
    * [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview): For efficiently loading and displaying large datasets in lists (e.g., news articles).

* **Build & Tooling:**
    * [Gradle (Kotlin DSL)](https://docs.gradle.org/current/userguide/kotlin_dsl.html): For build automation.
    * [Kotlinx Serialization](https://github.com/Kotlin/kotlinx.serialization): For serializing/deserializing Kotlin objects (used with Navigation Component for type-safe argument passing).

* **Testing (likely based on common dependencies seen in similar projects, verify specific usage):**
    * [JUnit 5](https://junit.org/junit5/): For unit testing.
    * [MockK](https://mockk.io/): For creating mocks in Kotlin unit tests.
    * [Turbine](https://github.com/cashapp/turbine): For testing Kotlin Flows.
