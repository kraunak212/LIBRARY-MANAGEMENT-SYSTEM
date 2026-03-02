📚 Library Management System

A console-based Library Management System built using Java and Object-Oriented Programming (OOP) principles.
This project allows users to manage books and members efficiently through a menu-driven interface.

🚀 Features

Add new books

Register new members

Display all books

Display available books

Search books (by title, author, or genre)

Borrow books (with availability validation)

Return books

Menu-driven console interface

🛠 Technologies Used

Java (JDK 17+)

Object-Oriented Programming

ArrayList (Java Collection Framework)

📂 Project Structure
Library Management System/
│
├── Book.java
├── Member.java
├── Library.java
└── LibrarySystem.java
📌 File Description
File	Description
Book.java	Stores book details and availability
Member.java	Stores member details and borrowed books
Library.java	Handles business logic and operations
LibrarySystem.java	Main class with menu-driven interface
🧠 OOP Concepts Implemented

Encapsulation → Private variables with public getters/setters

Abstraction → Business logic hidden inside methods

Association → Member associated with Book via borrowedBooks list

Modular Design → Each class has a single responsibility

⚙️ How to Run the Project
1️⃣ Clone or Download the Project
git clone <repository-url>

OR download ZIP and extract.

2️⃣ Compile the Program

Open terminal inside project folder:

javac *.java
3️⃣ Run the Program
java LibrarySystem
📋 Sample Menu
=== LIBRARY MANAGEMENT SYSTEM ===
1. Add New Book
2. Register New Member
3. Display All Books
4. Display Available Books
5. Search Books
6. Borrow Book
7. Return Book
8. Exit
🔎 Search Functionality

Search works using:

Title

Author

Genre

Search is case-insensitive.

Example:

Keyword: Java
🧪 Testing

All major functionalities tested:

Book addition

Member registration

Search validation

Borrow validation

Return validation

All test cases passed successfully.

📊 System Architecture
LibrarySystem (UI Layer)
        ↓
Library (Business Logic Layer)
        ↓
Book & Member (Data Layer)
⚠ Limitations

No database integration

Data not stored permanently

No fine calculation

Console-based only

🔮 Future Enhancements

File handling or database support

GUI version

Fine calculation

Admin login system

ISBN-based advanced search

👨‍💻 Author

Raunak Kumar
Java OOP Project

📌 License

This project is developed for internship project.
