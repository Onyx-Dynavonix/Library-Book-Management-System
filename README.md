# Digital Library Book Management System

## Objective
The Digital Library Book Management System helps librarians efficiently manage book records, including adding, updating, searching, and deleting books while keeping track of their availability.

## Features
### 1. Add a Book
- Accepts Book ID, Title, Author, Genre, and Availability Status as input.
- Stores the book details in a database.

### 2. View All Books
- Displays a list of all books with their details.

### 3. Search for a Book
- Allows searching for a book using **ID** or **Title**.

### 4. Update Book Details
- Modifies book details, including:
  - Changing availability status
  - Updating title, author, or genre

### 5. Delete a Book Record
- Removes a book from the catalog.

## Constraints
- **Book ID** must be unique.
- **Title** and **Author** must be non-empty strings.
- **Availability status** must be either `Available` or `Checked Out`.

## Technologies Used
- **Spring Boot** (RESTful API)
- **Spring Data JPA** (Repository Pattern)
- **JPA/Hibernate** (Data Persistence)
- **MySQL** (Database)

## Installation & Setup
### Prerequisites
- Java 17 or later
- Maven
- MySQL database

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/Onyx-Dynavonix/Library-Book-Management-System.git
   cd Library-Book-Management-System
   ```

2. Configure the database:
   - Update `src/main/resources/application.properties` with your MySQL database credentials:
   
   ```properties
   spring.application.name=Library
   spring.datasource.url=jdbc:mysql://localhost:3306/library_db
   spring.datasource.username=root
   spring.datasource.password=Password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```

3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

### API Endpoints
- `POST /books/add` → Add a new book
- `GET /books/` → Retrieve all books
- `GET /books/search?bookId={id}` or `GET /books/search?title={title}` → Search for a book
- `PUT /books/update/{bookId}` → Update a book
- `DELETE /books/delete/{bookId}` → Delete a book

## Future Enhancements
- Implement a frontend UI for better usability.
- Add authentication and authorization for librarian roles.
- Integrate book borrowing/returning functionality.
- Implement API rate limiting and request validation.



---
**Developed By:** Md Jasim Ansari
