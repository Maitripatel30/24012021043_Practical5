
# Practical 5: Login and Registration Using Jetpack Compose

## 🎯 Aim
To create an Android application that includes Login and Registration screens using Jetpack Compose.

## 📚 Study
[Jetpack Compose Course — Android Developers](https://developer.android.com/courses/jetpack-compose/course)

## 📝 Objectives
- To understand the fundamentals of Jetpack Compose.
- To design Login and Registration screens.
- To use composable functions to build the user interface.
- To collect user input using text fields.
- To use buttons and layouts to create an interactive UI.
- To understand state management and navigation between screens.

## 🛠️ Technologies Used

| Technology | Description |
|---|---|
| Kotlin | Programming language |
| Jetpack Compose | Declarative UI toolkit |
| Android Studio | Android development IDE |
| Material Design 3 | UI components and styling |
| Gradle | Build automation |

## ✨ Features

### 1. Login Screen
- Allows users to enter their login details.
- Provides input fields for credentials.
- Includes a Login button.

### 2. Registration Screen
- Allows new users to enter their details.
- Provides fields for registration information.
- Includes a Register button.

### 3. Jetpack Compose UI
- Uses composable functions to create UI elements.
- Organizes components with Compose layouts.
- Uses state to manage user input.

*Note: The exact fields and behavior depend on the implementation in the project.*

## 🧩 Concepts Used

### `@Composable`
Used to define functions that build the user interface.

```kotlin
@Composable
fun LoginScreen() {
    // Login screen UI
}
```

### `TextField`
Accepts user input such as an email address or username.

### `Button`
Creates a clickable button to perform an action.

### `Column` and `Row`
- `Column` arranges UI elements vertically.
- `Row` arranges UI elements horizontally.

### State Management
Compose state allows the UI to respond when input values change.

```kotlin
var email by remember { mutableStateOf("") }
```

### Navigation
Navigation allows the user to move between Login and Registration screens.

## 📂 Project Structure

```text
24012021043_Practical5/
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── ...
│           ├── res/
│           └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## ▶️ How to Run
1. Clone or download the repository.
2. Open the project in Android Studio.
3. Wait for Gradle synchronization to complete.
4. Connect an Android device or start an emulator.
5. Click the **Run ▶** button.
6. Test the Login and Registration screens.

## 🎓 Learning Outcomes
After completing this practical, I learned:
- How to create Android screens using Jetpack Compose.
- How to use composable functions and UI components.
- How to collect user input using text fields.
- How to arrange UI elements with Compose layouts.
- How to manage UI state and understand screen navigation.

## 👩‍💻 Author
**Maitri Patel**  


