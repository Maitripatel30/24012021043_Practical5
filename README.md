
# Practical 5: Login and Registration Using Jetpack Compose

## 🎯 Aim
To create an Android application that includes Login and Registration screens using Jetpack Compose.

## 📚 Study
[Jetpack Compose Course — Android Developers](https://developer.android.com/courses/jetpack-compose/course)

## 📝 Objectives
- To understand the basics of Jetpack Compose.
- To design a Login screen for existing users.
- To design a Registration screen for new users.
- To use composable functions to build the user interface.
- To handle user input using Compose components.
- To understand the use of state in Jetpack Compose.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Kotlin | Application programming language |
| Jetpack Compose | Building the Android UI |
| Android Studio | Development environment |
| Material Design | UI components and styling |
| Gradle | Project build and dependency management |

## ✨ Application Features

### 1. Login Screen
- Provides input fields for user credentials.
- Includes a Login button.
- Demonstrates building a form using Jetpack Compose.

### 2. Registration Screen
- Provides a form for new users to enter their details.
- Includes a Register button.
- Demonstrates the use of Compose UI components for collecting input.

### 3. Compose UI
- Uses composable functions to create reusable UI components.
- Uses layout components to arrange elements.
- Uses state management to handle user input.

*Note: The listed features describe the practical's intended functionality. Authentication and data storage depend on your actual implementation.*

## 🧩 Important Jetpack Compose Concepts

### `@Composable`
The `@Composable` annotation identifies functions that describe UI elements.

```kotlin
@Composable
fun LoginScreen() {
    // Login screen UI
}
```

### `TextField`
Used to accept text input, such as an email address or username.

### `Button`
Used to perform an action when the user clicks it.

### `Column` and `Row`
- `Column` arranges elements vertically.
- `Row` arranges elements horizontally.

### State Management
Compose state can store input values and update the UI when values change.

```kotlin
var email by remember { mutableStateOf("") }
```

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
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## ▶️ How to Run
1. Clone or download this repository.
2. Open the project in Android Studio.
3. Wait for Gradle sync to finish.
4. Connect an Android device or start an emulator.
5. Click the **Run ▶** button.
6. Test the Login and Registration screens.

## 🎓 Learning Outcomes
After completing this practical, I learned:
- How to create Android UI screens using Jetpack Compose.
- How to use composable functions and layout components.
- How to create forms with input fields and buttons.
- How to manage user input with Compose state.
- How to structure a basic Android application.

## 👩‍💻 Author
**Maitri Patel**  

