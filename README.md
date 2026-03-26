# 📚 Library Management System

> A backend-driven system to manage books, users, and transactions for a library — built with Java and Spring Boot, with full CRUD operations via RESTful APIs.

---

## 🛠️ Tech Stack

| Layer     | Technology         |
|-----------|--------------------|
| Backend   | Java, Spring Boot  |
| Database  | MySQL              |
| Tools     | Eclipse, Maven     |

---

## ✨ Features

- 📖 Add, update, delete, and search books by title or author
- 👤 User registration and member management
- 🔄 Issue and return book transactions with date tracking
- 📋 View all active and completed transactions
- ✅ Full CRUD operations via RESTful Spring Boot APIs
- 🔗 JPA/Hibernate for seamless MySQL integration

---

## 📁 Project Structure

```
library-management-system/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/library/
│       │       ├── controller/        # REST Controllers (BookController, UserController, etc.)
│       │       ├── model/             # Entity classes (Book, User, Transaction)
│       │       ├── repository/        # JPA Repositories
│       │       └── service/           # Business logic layer
│       └── resources/
│           └── application.properties # DB config
├── pom.xml
└── README.md
```

---

## ⚙️ How to Run Locally

### Prerequisites
- Java 11+ installed
- MySQL installed and running
- Maven installed
- Eclipse or VS Code

### Steps

```bash
# 1. Clone the repository
git clone https://github.com/Afrah/library-management-system.git

# 2. Open the project in Eclipse or VS Code

# 3. Create a MySQL database
#    Open MySQL and run:
CREATE DATABASE librarydb;

# 4. Configure the database connection
#    Open: src/main/resources/application.properties
#    Update these lines:

spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update

# 5. Run the application
mvn spring-boot:run
```

✅ API will be running at: `http://localhost:8080`

---

## 📡 API Endpoints

### 📖 Books

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| GET    | /api/books       | Get all books        |
| GET    | /api/books/{id}  | Get book by ID       |
| POST   | /api/books       | Add a new book       |
| PUT    | /api/books/{id}  | Update book details  |
| DELETE | /api/books/{id}  | Delete a book        |

### 👤 Users

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| GET    | /api/users       | Get all users        |
| POST   | /api/users       | Register a new user  |
| DELETE | /api/users/{id}  | Remove a user        |

### 🔄 Transactions

| Method | Endpoint                    | Description           |
|--------|-----------------------------|-----------------------|
| POST   | /api/transactions/issue     | Issue a book to user  |
| POST   | /api/transactions/return    | Return a book         |
| GET    | /api/transactions           | View all transactions |

---


## 🚀 Future Enhancements

- 🔐 JWT-based authentication for secured API access
- 🖥️ React.js frontend for library staff UI
- 📧 Email notifications for due dates and overdue books
- 📊 Reports on most borrowed books and active members

---

## 🙋‍♀️ Author

**Afrah Khatoon**
📧 afrahkhan2511@gmail.com
🔗 [LinkedIn](https://linkedin.com/in/afrah-khan-840048302) | [GitHub](https://github.com/Afrah)
