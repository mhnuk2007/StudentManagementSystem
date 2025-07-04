# 🎓 Student Management System

A simple Java-based Student Management System demonstrating basic **CRUD operations** using **Hibernate Core** with **Annotations**. This version uses only two classes — `Student` and `Main` — to keep the structure simple and beginner-friendly. It uses **PostgreSQL** for database interaction.

---

## 🧠 Concepts Covered

- CRUD (Create, Read, Update, Delete) operations
- Hibernate ORM with Annotations
- PostgreSQL database connectivity
- Basic session and transaction handling

---

## ✨ Features

- ➕ Add a new student
- ✏️ Update existing student details
- 🗑️ Delete a student by roll number
- 📋 View all students

Each student record includes:

- Roll Number
- Name
- Age
- Address

---

## 🔧 Skills Practiced

- Hibernate configuration using `hibernate.cfg.xml`
- Hibernate session management
- Basic entity mapping with annotations
- Transaction handling

---

## 🛠️ Technologies Used

- Java 8+
- Hibernate 5+
- PostgreSQL
- JDBC Driver
- IDE: IntelliJ IDEA / Eclipse

---

## 📁 Project Structure

```
StudentManagementSystem/
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───learning
|   │   │           ├── Student.java          # Entity class
│   |   │           └── Main.java             # Main application
│   │   └───resources                         # Hibernate configuration
|   |               └─── hibernate.cfg.xml    # Hibernate configuration
├── README.md                                 # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- Java installed
- PostgreSQL running
- Hibernate libraries in classpath
- PostgreSQL JDBC driver

### Setup Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/mhnuk2007/StudentManagementSystem.git
   cd StudentManagementSystem
   ```

2. Create the PostgreSQL database:
   ```sql
   CREATE DATABASE studentdb;
   ```

3. Configure your `hibernate.cfg.xml` file:
   ```xml
   <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
   <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/studentdb</property>
   <property name="hibernate.connection.username">postgres</property>
   <property name="hibernate.connection.password">0000</property>
   ```

4. Compile and run:
   - If using an IDE, run `Main.java`.

---

## 📷 Sample Output (Optional)

```text
Welcome to Student Management System
1. Add Student
2. Update Student
3. Delete Student
4. View All Students
5. Exit
Enter your choice:
```

---

## 📜 License

This project is licensed under the MIT License.

---

## 📫 Contact

Developed by **Mohan Lal**

- GitHub: [mhnuk2007](https://github.com/mhnuk2007/StudentManagementSystem)
