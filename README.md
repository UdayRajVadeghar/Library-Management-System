# Library Management System

A terminal program running on Java, the Library Management System was created to make managing library resources easier. It provides basic features including user registration, book addition and modifications, and effective monitoring of borrowed and returned books. With the help of the system, librarians can keep track of patron information, oversee the inventory of books, and ensure smooth library operations. This project offers library employees a user-friendly way to effectively plan and manage library operations using an easy terminal interface.

## Features

- **Book Management:**
  - Add new books to the library.
  - Remove books from the library.
  - Display details of all books in the library.

    **OOP Principle Used:** 
    - **Encapsulation:** The `Book` class encapsulates the details of a book and provides methods to interact with its attributes.

- **User Management:**
  - Add new users to the library.
  - Remove users from the library.

    **OOP Principle Used:** 
    - **Encapsulation:** The `User` class encapsulates user details and provides methods for user-related actions.

- **User Interactions:**
  - Allow users to check out books.
  - Allow users to return books.

    **OOP Principles Used:** 
    - **Association:** The `User` class is associated with the `Book` class to manage book check-out and return actions.

- **Display Information:**
  - View details of a specific user.
  - View details of all books in the library.

    **OOP Principle Used:** 
    - **Polymorphism:** The `displayDetails` method is implemented differently in both the `Book` and `User` classes.

- **To-Do (Future Enhancements):**
  - Implement book search functionality.
  - Implement due date notifications.
  - Improve user interaction with a graphical user interface.
  - Web Deployment

## Getting Started

### Prerequisites

Make sure you have the following installed on your system:

- Java Development Kit (JDK)
- IDE ( I personally use IntelliJ)
- Git (optional, for cloning the repository)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/LibraryManagementSystem.git
    ```

2. Navigate to the project directory:

    ```bash
    cd LibraryManagementSystem
    ```

3. Compile the Java files:

    ```bash
    javac *.java
    ```

4. Run the main class:

    ```bash
    java LibraryManagementSystem
    ```

## Usage

- Follow the on-screen instructions to interact with the Library Management System.
- Add books, add users, and perform various library actions.

## Project Structure

The structure of the project :

- **LibraryManagementSystem.java:** The main class containing the `main` method for executing the program.
- **Book.java:** Represents the Book class with details and methods related to books.
- **Genre.java:** Represents the Genre class for book categorization.
- **User.java:** Represents the User class with details and methods related to library users.
- **Library.java:** Represents the Library class containing methods for book and user management.

Feel free to explore and expand upon the project based on your learning goals and project requirements.
