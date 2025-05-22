## News Application - Jetpack Compose Clean Architecture Example

News app is a sample project that displays news using the News API, built with Jetpack Compose.It demonstrates the current UI capabilities of Compose and follows the Clean Architecture and MVVM design patterns


## Features

The example shows current news from thenewsapi and other information such as:
   * Newsfeeds
   * Bookmark article
   * View article detail
## Data-Flow

![data-flow](https://github.com/user-attachments/assets/1b3ebc02-05ba-4270-a356-fa7c840a117e)


## Tech Stack & Architecture

* **Core:**
    * [Kotlin](https://kotlinlang.org/)
    * [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)
    * [Kotlin Flows](https://kotlinlang.org/docs/flow.html)

* **Architecture:**
    * Clean Architecture
    * MVVM (Model-View-ViewModel)

* **Dependency Injection:**
    * [Hilt](https://dagger.dev/hilt/)

* **User Interface (UI):**
    * [Jetpack Compose](https://developer.android.com/jetpack/compose)
    * [Material 3](https://m3.material.io/)
    * [Compose Navigation](https://developer.android.com/jetpack/compose/navigation)
    * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
    * [Coil](https://coil-kt.github.io/coil/compose/)

* **Networking:**
    * [Retrofit](https://square.github.io/retrofit/)
    * [OkHttp](https://square.github.io/okhttp/)
    * [Gson](https://github.com/google/gson)

* **Data & Storage:**
    * [Room](https://developer.android.com/training/data-storage/room)
    * [Paging 3](https://developer.android.com/topic/libraries/architecture/paging/v3-overview)

* **Testing:**
    * [JUnit 5](https://junit.org/junit5/)
    * [MockK](https://mockk.io/)
    * [Turbine](https://github.com/cashapp/turbine)
