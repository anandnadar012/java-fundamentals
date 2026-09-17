package oop_projects;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.getStatus() == BookStatus.AVAILABLE) {
            book.borrowItem(name);
            book.printDueDate(14);
            borrowedBooks.add(book);

            System.out.println(
                    name + " borrowed " + book.getTitle() + "."
            );
        } else {
            System.out.println(
                    "Cannot borrow " + book.getTitle() + " because it is unavailable."
            );
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnItem();
            System.out.println(
                    name + " returned " + book.getTitle() + "."
            );
        } else {
            System.out.println(
                    name + " does not currently have this book."
            );
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
            return;
        }

        System.out.println(name + "'s borrowed books:");

        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}
