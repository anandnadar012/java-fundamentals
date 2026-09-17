package oop_projects;

public class LibraryDriver {
    public static void main(String[] args) {
        Library library = new Library();

        // Physical book: regular Book object
        Book physicalBook = new Book(
                "ISBN-123",
                "Atomic Habits",
                "James Clear"
        );

        // Digital book: EBook subclass object
        EBook digitalBook = new EBook(
                "ISBN-456",
                "Clean Code",
                "Robert Martin",
                15.5
        );

        System.out.println("Adding books:");

        library.addBook(physicalBook);
        library.addBook(digitalBook);

        System.out.println("\nTesting duplicate ISBN:");

        Book duplicateBook = new Book(
                "ISBN-123",
                "Different Book",
                "Different Author"
        );

        library.addBook(duplicateBook);

        System.out.println("\nBorrowing physical book:");

        Member member = new Member("M001", "Alice");
        member.borrowBook(physicalBook);

        System.out.println("\nMember's borrowed books:");
        member.displayBorrowedBooks();

        System.out.println("\nLibrary catalog:");
        library.displayAllBooks();
    }
}
