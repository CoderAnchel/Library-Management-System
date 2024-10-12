# JAVA☕️ Library Management System 
![inaki-del-olmo-NIJuEQw0RKg-unsplash](https://github.com/user-attachments/assets/4cf66ec6-a470-49fd-a435-18f4a400c24c)
## 1. Project Overview

This is a **Library Management System** designed to manage books, users, and loans within a library. The system is built using **Object-Oriented Programming (OOP)** principles, and it models core entities such as `Book`, `User`, and `Loan`. The goal is to provide features that allow the addition of new books, searching for books by title or author, user registration, and handling loan transactions between users and the library.

## 2. Features

- **Book Management**: 
  - Add new books to the library.
  - Manage the availability status of books (available or on loan).

- **User Management**: 
  - Register new library members.
  - Track user information, such as name, ID, and loan history.

- **Loan Management**: 
  - Record book loans, including the date of the loan and return date.
  - Associate loans with specific users and books.
  - Ensure that users can only borrow available books.

## 3. Main Classes

### 3.1. `Book`
This class represents the books in the library. It contains the following attributes:
- **Title**: The name of the book.
- **Author**: The author of the book.
- **ISBN**: A unique identifier for the book.
- **Availability Status**: Whether the book is currently available or on loan.

### 3.2. `User`
This class represents library members. It contains the following attributes:
- **Name**: The user's name.
- **User ID**: A unique identifier for each user.

### 3.3. `Loan`
This class handles loan transactions in the library. It contains the following attributes:
- **Loan Date**: The date when the book was borrowed.
- **Return Date**: The expected date of return.
- **Loaned Book**: The book being borrowed.
- **Borrowing User**: The user who is borrowing the book.

## 4. OOP Concepts Implemented

- **Encapsulation**: Attributes of each class are kept private and accessed or modified using getter and setter methods to protect the integrity of the data.
  
- **Abstraction**: The system hides complex operations (like loan management and user-book interactions) within the methods of each class, allowing easy and organized access to core functionalities.

- **Object Relationships (Aggregation/Composition)**: The system models relationships between objects. For example:
  - A `User` can have multiple `Loan` objects in their loan history (aggregation).
  - A `Loan` object consists of a `Book` and a `User` (composition).

## 5. Goals of the Project

- Practice fundamental OOP concepts such as class abstraction, encapsulation, and object relationships.
- Build a scalable system that can be expanded with more features (e.g., overdue fees, book reservations).
- Ensure clean code organization and separation of concerns through the proper use of classes and methods.

---
