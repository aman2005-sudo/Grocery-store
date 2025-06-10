# 🛒 Grocery Store Management System (Console-Based Java Project)

A simple console-based grocery store management system built using Java. This project demonstrates file handling, data validation, layered architecture, and a clean user interface in the console.

---

## 📁 Project Structure
GroceryStoreManagementSystem/
├── GroceryItem.java // Model class
├── GroceryStore.java // DAO class for File I/O and operations
├── GroceryStoreApp.java // Main class with user menu
├── grocery_items.txt // File for storing data
└── README.md

---

## 🔧 JDK & IDE Setup

- *JDK Version:* Java 8 or above
- *IDE Used:* IntelliJ IDEA / Eclipse
- Project created with proper folder and file structure.

---

## 🗃 File-Based Storage System

- Data is saved in a file named grocery_items.txt.
- Used java.io.* package for performing:
  - Create / Read / Update / Delete operations.
- File is auto-created if not present.

---

## 🧱 Architecture

This project follows a basic layered architecture:

- *Model:* GroceryItem.java  
- *DAO:* GroceryStore.java  
- *Controller/UI:* GroceryStoreApp.java  

---

## 💻 Features

| Feature           | Description                                      |
|------------------|--------------------------------------------------|
| ➕ Add Item       | Add grocery item with name, quantity, price      |
| ❌ Delete Item    | Delete an item by name                           |
| 📋 Display Items  | Show all items with their total prices           |
| 💰 Calculate Bill | Calculate and display total cost of all items    |
| 💾 Save & Load    | Automatically loads and saves to a text file     |

---

## 🎨 Console UI/UX Design

- Clear menu with numbered options
- Error messages for invalid inputs
- Simple and responsive interaction
- Input is validated before processing

---


## 🔗 GitHub Link

[🔗 Click Here to View Repository](https://github.com/your-username/GroceryStoreManagementSystem)

---

## ✅ How to Run

1. Clone the repository:
```bash
git clone https://github.com/aman2005-sudo/Grocery-store/edit/main/README.md

2)Open in your IDE (IntelliJ/Eclipse).

3)Run GroceryStoreApp.java.

📄 Sample File Format (grocery_items.txt)

Milk,2,30.5
Bread,1,25
Eggs,12,6.5

📌 Evaluation Criteria Addressed
| Criteria                          | Status |
| --------------------------------- | ------ |
| JDK & IDE Setup                   | ✅ Done |
| Project Structure Defined         | ✅ Done |
| File CRUD using IO Package        | ✅ Done |
| Layered Architecture (Model, DAO) | ✅ Done |
| Console UI – Clean & Aligned      | ✅ Done |
| Input Validation                  | ✅ Done |
| File Auto Creation                | ✅ Done |
| GitHub Repo with README           | ✅ Done |


