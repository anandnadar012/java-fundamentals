package oop_projects;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println(
                    "Warning: This book already exists in the library."
            );
        } else {
            books.add(book);
            System.out.println(
                    "Book added successfully: " + book.getTitle()
            );
        }
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("The library has no books.");
            return;
        }

        System.out.println("All books in the library:");

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
