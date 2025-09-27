# Patika.dev Java Online Bank System

## Description

### A simple console-based banking system in Java that allows users to:

- Sign up and log in

- View account balance

- Transfer money to other users

- Pay credit debt

- Pay credit card debt

- User data is stored in a JSON file and automatically updated after each transaction.

## Features

- Demo user creation for quick testing

- Menu-driven interface (Main Menu → Login/Sign-Up → Account Menu)

- Real-time balance and debt updates

- File persistence using Gson

- Input validation (passwords cannot contain birthday, transfers cannot exceed balance)


## UML Diagrams
### Menu UML

>>![img.png](src/_250926_Bank/MenuUml.png)

### Controller Helper UML

>>![ControllerHelperUml.png](src/_250926_Bank/ControllerHelperUml.png)
## License

This project is free to use, modify, and distribute.  
Citation is appreciated but not required.


## Getting Started
### Prerequisites

- Java 17+ installed

- IntelliJ IDEA or other Java IDE

### Running the Project

Clone the repository:

- git clone <https://github.com/ayhan-unlu/PatikaAdvancedJavaProjects/tree/master/src/_250926_Bank>


- Open the project in IntelliJ IDEA

- Run the Main class from _250926_Bank.Model

- Follow console prompts to sign up, log in, and perform banking actions

- Demo User: nationalIdNumber: 0000, password: 0000

File Storage

- All user data is stored in Users.json in the project folder. This file is automatically updated after every transaction.

## Project Structure
- _250926_Bank/
- ├─ Controller/      - Business logic & menu handling
- ├─ Model/           - User model & Main class
- ├─ View/            - Menu display classes
- Users.json          - User data storage

## Future Improvements

- Add more robust input validation

- Add transaction history

- Implement interest calculations or savings accounts

- Add GUI interface