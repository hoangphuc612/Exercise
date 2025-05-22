## 🛠 Tech Stack & Architecture

This project leverages a modern Android development stack, focusing on Kotlin, Jetpack libraries, and established architectural patterns.

* **Core:**
    * [Kotlin](https://kotlinlang.org/): Primary programming language.
    * [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html): For asynchronous programming and managing background tasks.
    * [Kotlin Flows](https://kotlinlang.org/docs/flow.html): Used extensively for reactive data streams, particularly with Room and network responses.

* **Architecture:**
    * **Clean Architecture (likely):** The separation into `data`, `domain`, and `presentation` layers suggests an attempt to follow Clean Architecture principles.
    * **MVVM (Model-View-ViewModel):** Used within the presentation layer to separate UI logic from business logic.

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
    * [JUnit 4/5](https://junit.org/junit5/): For unit testing.
    * [MockK](https://mockk.io/): For creating mocks in Kotlin unit tests.
    * [Turbine](https://github.com/cashapp/turbine): For testing Kotlin Flows.
    * [Espresso](https://developer.android.com/training/testing/espresso) / [Compose Test Rule](https://developer.android.com/jetpack/compose/testing): For UI testing.
    * `kotlinx-coroutines-test`: For testing coroutines.

* **Other Libraries:**
    * [Timber](https://github.com/JakeWharton/timber): For enhanced logging.
    * (Potentially others based on specific features not immediately obvious from build files alone)

This list is based on the dependencies declared in your Gradle files and common practices associated with them. You can adjust it further if there are other significant tools or libraries you've used.
