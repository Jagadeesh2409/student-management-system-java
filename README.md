# Student Management System

A simple console-based Java application that allows users to manage student records using JDBC and MySQL.

## 🔧 Technologies Used
- Java (Core + JDBC)
- MySQL
- Console-based UI

## 📂 Features
- Add Student
- View Students
- Update Student
- Delete Student

## 🛠️ Setup Instructions

### 1. Create MySQL Database
```sql
CREATE DATABASE student_db;
USE student_db;
CREATE TABLE students (
  id INT PRIMARY KEY,
  name VARCHAR(100),
  age INT,
  course VARCHAR(100)
);
