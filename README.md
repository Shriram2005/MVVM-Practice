# Counter App with MVVM Architecture in Jetpack Compose

This project is a simple demonstration of the Model-View-ViewModel (MVVM) architecture in Android using Jetpack Compose. It features a basic counter application that allows users to increment and decrement a counter value. This app showcases the principles of MVVM by separating the UI layer from the business logic, ensuring a clean and maintainable codebase.



## Overview

The Counter App is designed to help developers understand the basics of implementing the MVVM architecture pattern in Android applications using Jetpack Compose. The app consists of a simple counter that can be incremented or decremented by tapping buttons. The counter value is displayed on the screen, and the UI reacts to changes in the underlying data.

## Architecture

This project follows the MVVM architecture:

- **Model:** Represents the data layer of the application. In this example, the model is the `Model.kt`, which holds the current value of the counter.

- **View:** The UI layer, built with Jetpack Compose, is responsible for displaying the counter value and the increment/decrement buttons. It observes the `ViewModel` for any state changes.

- **ViewModel:** Acts as a bridge between the View and Model. It contains the business logic for incrementing and decrementing the counter. The `ViewModel` exposes the current state of the counter to the UI and handles user interactions.

## Features

- Simple counter increment and decrement functionality.
- Reactive UI updates with Jetpack Compose.
- Clean separation of concerns following the MVVM architecture.

## Screenshots

![Screenshot 2024-08-19 154242](https://github.com/user-attachments/assets/c1dc6ddd-05c9-4723-97f6-675bcdc00597)
![Screenshot 2024-08-19 154339](https://github.com/user-attachments/assets/a71d4467-199f-4ecc-856b-106e21160ff8)



## Installation

To run this project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/Shriram2005/MVVM-Practice.git
   ```
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

## Usage

- Launch the app on your device.
- Use the "+" button to increment the counter.
- Use the "-" button to decrement the counter.
- The counter value will update in real-time as you interact with the buttons.

## Contributing

Contributions are welcome! If you have any suggestions or improvements, feel free to create a pull request or open an issue.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---
