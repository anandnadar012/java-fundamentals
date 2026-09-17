package oop_projects;

import java.util.Objects;

public class Book implements Borrowable{
    private String isbn;
    private String title;
    private String author;
    private BookStatus status;

    public Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.status = BookStatus.AVAILABLE;
    }
    public BookStatus getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public void borrowItem(String memberName) {
        if (status == BookStatus.AVAILABLE) {
            status = BookStatus.BORROWED;
            System.out.println(
                    "Book " + title + " checked out by " + memberName + "."
            );
        } else {
            System.out.println(
                    "Book " + title + " is unavailable."
            );
        }
    }

    @Override
    public void returnItem() {
        status = BookStatus.AVAILABLE;
        System.out.println("Book " + title + " has been returned.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book otherBook = (Book) o;
        return Objects.equals(this.isbn, otherBook.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book[ISBN=" + isbn
                + ", Title=" + title
                + ", Author=" + author
                + ", Status=" + status + "]";
    }
    public String getDetails(){
        return "Book[ISBN=" + isbn
                + ", Title=" + title
                + ", Author=" + author + "]";

    }
}


