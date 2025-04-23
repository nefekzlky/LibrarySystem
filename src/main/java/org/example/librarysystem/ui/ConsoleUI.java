package org.example.librarysystem.ui;

import org.example.librarysystem.model.Book;
import org.example.librarysystem.service.Library;

import java.util.Scanner;

public class ConsoleUI {
    private Library library;
    private Scanner scanner;

    public ConsoleUI() {
        library = new Library();
        scanner = new Scanner(System.in);
        library.initializeSampleData();
    }

    public void start() {
        while (true) {
            System.out.println("Welcome to the library!");
            System.out.println("1. Add book");
            System.out.println("2. Remove book");
            System.out.println("3. List books");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    removeBook();
                case "3":
                    library.listBooks();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option!");
                    break;

            }

        }
    }

    private void addBook() {
        System.out.println("Please enter the title: ");
        String title = scanner.nextLine();

        System.out.println("Please enter the author: ");
        String author = scanner.nextLine();

        System.out.println("Please enter the year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the number of pages: ");
        int pages = Integer.parseInt(scanner.nextLine());

        Book book = new Book(title, author, year, pages);
        library.addBook(book);

    }

    private void removeBook() {
        library.listBooks();
        System.out.println("Please enter the index of the book to remove: ");
        try {
            int index = Integer.parseInt(scanner.nextLine()) - 1;
            library.removeBook(index);
        } catch (NumberFormatException e) {
            System.out.println("Invalid index!");
        }

    }

}
