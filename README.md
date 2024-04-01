This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

* `/shared` is for the code that will be shared between all targets in the project.
  The most important subfolder is `commonMain`. If preferred, you can add code to the platform-specific folders here too.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

## Technologies Used

* Ktor for networking
* Koin for DI
* Native UI ( swift ui for ios, compose for android )
* shared business logic

## Screenshots
<div align="center">
  <img src="https://github.com/HoneyCakeTeam/BusyBee/assets/31763341/c7fbe380-03c2-4b78-915d-f41976c9244b" alt="Screenshot 1" width="150" style="border: 5px solid #ccc; border-radius: 15px;">
  <img src="https://github.com/HoneyCakeTeam/BusyBee/assets/31763341/a25aad86-ec8d-41e1-bf5f-4788f5058007" alt="Screenshot 2" width="200" style="border: 5px solid #ccc; border-radius: 15px;">  
