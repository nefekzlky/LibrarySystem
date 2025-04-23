# Library Management System

A simple console-based library management application written in Java, designed to help you practice object-oriented programming, collections management, and user interaction. This project serves as the core foundation for a future JavaFX GUI version with user roles (admin and regular user), book rentals, and more.

---

## Features

- **Book Model**: Represents books with title, author, publication year, and page count.
- **Library Service**:
    - Add new books
    - List all books
    - Remove books by index
    - Load sample book data for quick testing
- **Console UI**:
    - Interactive menu-driven interface
    - Add, list, and remove books
    - Easy-to-follow prompts
- **Entry Point**: `Main.java` to launch the console interface

---

## Prerequisites

- Java 17 or later
- IntelliJ IDEA (or your preferred Java IDE)
- (Optional for GUI version) JavaFX SDK and Scene Builder

---

## Project Structure

```
org.example.librarysystem/
├── model/
│   └── Book.java        # Book data class
├── service/
│   └── Library.java     # Business logic for managing books
├── ui/
│   └── ConsoleUI.java   # Console-based user interface
└── Main.java            # Application entry point
```

Additional JavaFX files (`hello-view.fxml`, `HelloController.java`, etc.) are retained for future GUI development.

---

## Installation & Running

1. **Clone the repository**:

   ```bash
   git clone <repository-url>
   cd LibrarySystem
   ```

2. **Open in IntelliJ IDEA**:

    - Select **File > Open** and choose the project folder.

3. **Run the application**:

    - In the Project view, right-click `Main.java` and select **Run 'Main.main()'**.

4. **Use the menu**:

    - Follow on-screen prompts to add, list, or remove books, or exit the program.

---

## Usage Example

```text
--- Library System ---
1. Add Book
2. Remove Book
3. List Books
4. Exit
Your choice: 1
Book title: Les Misérables
Author: Victor Hugo
Publication year: 1862
Page count: 1232
Book added: Les Misérables
```

\--- Library System ---

1. Add Book
2. List Books
3. Remove Book
4. Exit
   Your choice: 1
   Book title: Les Misérables
   Author: Victor Hugo
   Publication year: 1862
   Page count: 1232
   Book added: Les Misérables


---

## Next Steps

- Migrate the core logic to a JavaFX GUI
- Implement user roles (admin vs. regular user)
- Add book rental/return functionality with date selection
- Persist data to file or database

---

## Contributing

Feel free to open issues or submit pull requests. For major changes, please discuss the proposal via issue first.

---

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

