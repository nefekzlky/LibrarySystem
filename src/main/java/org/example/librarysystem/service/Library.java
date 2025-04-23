package org.example.librarysystem.service;
import org.example.librarysystem.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            Book removed = books.remove(index);
            System.out.println("Book removed: " + removed.getTitle());
        } else {
            System.out.println("Invalid index!");
        }
    }


    // List the books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is currently empty.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i));
            }
        }
    }

    public void initializeSampleData() {
        books.add(new Book("Sefiller", "Victor Hugo", 1862, 1232));
        books.add(new Book("1984", "George Orwell", 1949, 328));
        books.add(new Book("Suç ve Ceza", "Fyodor Dostoyevski", 1866, 671));
        books.add(new Book("Simyacı", "Paulo Coelho", 1988, 190));
        books.add(new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 1943, 160));
    }


}
