# 🎓 Student Management System

A simple Java-based Student Management System that demonstrates basic **CRUD operations** using **Hibernate Core**. This project is designed to help beginners practice Hibernate concepts, such as session management, annotations or XML configuration, and database interaction with **MySQL** or **PostgreSQL**.

---

## 🧠 Concepts Covered

- CRUD (Create, Read, Update, Delete) operations
- Hibernate ORM (Object Relational Mapping)
- Hibernate Annotations / XML Configuration
- MySQL or PostgreSQL as backend database

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

- Hibernate configuration using XML or annotations
- Session and SessionFactory management
- Entity mapping with annotations
- Transaction handling with `Transaction` API

---

## 🛠️ Technologies Used

- Java 8+
- Hibernate 5+
- MySQL / PostgreSQL
- JDBC Driver
- (Optional) Maven for dependency management
- IDE: IntelliJ IDEA / Eclipse

---

## 📁 Project Structure

```
StudentManagementSystem/
│
├── src/
│   └── com/yourpackage/
│       ├── Student.java          # Entity class
│       ├── StudentDAO.java       # Data Access Object
│       └── Main.java             # Main application
│
├── hibernate.cfg.xml            # Hibernate configuration (if using XML)
├── pom.xml                      # Maven file (if using Maven)
└── README.md                    # Project documentation
```

---

## 🚀 Getting Started

### Prerequisites

- Java installed
- MySQL or PostgreSQL running
- Hibernate libraries in classpath (or use Maven)
- JDBC driver (MySQL or PostgreSQL)

### Setup Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/StudentManagementSystem.git
   cd StudentManagementSystem
   ```

2. Create a database:
   ```sql
   CREATE DATABASE studentdb;
   ```

3. Configure your database connection in `hibernate.cfg.xml`:
   ```xml
   <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/studentdb</property>
   <property name="hibernate.connection.username">root</property>
   <property name="hibernate.connection.password">yourpassword</property>
   ```

4. Compile and run:
    - If using an IDE, run `Main.java`.
    - If using Maven:
      ```bash
      mvn clean compile exec:java -Dexec.mainClass="com.yourpackage.Main"
      ```

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

## 🤝 Contributing

Feel free to fork this repo and submit pull requests. Suggestions and improvements are welcome!

---

## 📜 License

This project is licensed under the MIT License.

---

## 📫 Contact

Developed by **[Your Name]**

- GitHub: [@yourusername](https://github.com/yourusername)
- Email: your.email@example.com
- LinkedIn: [Your LinkedIn](https://www.linkedin.com/in/yourprofile)
