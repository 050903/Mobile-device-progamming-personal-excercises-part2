# 📱 Mobile device progamming personal excercises part2
## Assignment 1: Hello, world! Mobile app
![image](https://github.com/user-attachments/assets/c059ae1e-11ec-452d-b93c-abc9fcec9e1c)
![image](https://github.com/user-attachments/assets/5ca77032-ae0b-413a-b3eb-e994ab273655)
![image](https://github.com/user-attachments/assets/bc570301-3ec9-4fcd-aa58-70bb84065ae7)
### Image 1: SPIKETUNE Splash Screen
•	Startup screen displaying the SPIKETUNE logo centered.
•	White background with a purple top bar.
•	Slogan: "YOUR SOUNDTRACK, YOUR STORY – SPIKETUNE –" shown below the logo.
### Image 2: "Hello World" App Main Screen (Android Emulator: Pixel 5 API 36)
•	Simple interface showing the text "Hello World" centered on the screen
•	Light purple app bar with the title "Hello World".
## Assignment 2: Email format checking.
---------------
![image](https://github.com/user-attachments/assets/dab03c71-b8bc-4ed9-8d62-08450dc2c2ed)
![image](https://github.com/user-attachments/assets/f1587123-5984-4fce-a760-b52c85d49e0c)
---------------
Email Validation with Null Safety
![image](https://github.com/user-attachments/assets/779ecdb1-ae35-49b1-b169-d5a9cb238931)
---------------
### Key Points:
1.	Null check: isNullOrEmpty() handles both null and empty strings.
2.	Regex: Validates standard email format (e.g., user@example.com).
3.	Feedback: Uses Toast to show validation results
---------------

### Usage Example:
![image](https://github.com/user-attachments/assets/aae5f66d-987e-47f4-87cc-1016113427f0)

•	Rejects 0509031 (invalid format).
•	Accepts 0509031th@gmail.com (valid format).
•	Also handles null/empty inputs gracefully.

---------------
## Assignment 3: Age checking format.
![image](https://github.com/user-attachments/assets/f2f74ffa-7a51-4a74-8bab-a764f9306f46)
![image](https://github.com/user-attachments/assets/3b8f4b9e-c5d7-4e61-8368-96e8ec65fe38)
App Description & Technical Implementation
### Functionality:
A simple Age Checker screen that:
1.	Takes user name and age inputs
2.	Validates the age (numeric only)
3.	Classifies the user into age groups:
o	Baby (<2)
o	Child (2-5)
o	Adult (6-65)
o	Elderly (>65)
### Key Algorithms/Techniques Used:
1.	Input Validation
o	Regex-like filtering (for age): it.filter { char -> char.isDigit() }
o	Null safety with toIntOrNull()
2.	UI Components
o	Jetpack Compose for declarative UI
o	Material 3 theming (OutlinedTextField, Button)
o	State management with mutableStateOf
3.	Logic
o	Simple conditional branching (when statement) for age classification
### Android Studio Tools:
•	Compose Preview for real-time UI testing
•	Material Design 3 components
### Code Example (Kotlin):
![image](https://github.com/user-attachments/assets/3ec42570-d389-441b-b3aa-917cd56791c6)
### Purpose:
Demonstrates basic user input handling, validation, and UI theming in modern Android development.

## 👨‍💻 Author
Trần Thế Hảo

# 🎓 Information Technology, University of Transport Ho Chi Minh City (UTH)

![image](https://github.com/user-attachments/assets/c2488ba6-05d8-40dd-b8c6-ff3db7cf8cf5)
