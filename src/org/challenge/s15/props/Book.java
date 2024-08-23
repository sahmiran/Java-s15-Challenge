package org.challenge.s15.props;

import org.challenge.s15.enums.Status;
import org.challenge.s15.humans.Author;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public abstract class Book {
    private String book_ID;
    private Author author;
    private String title;
    private double price;
    private Status status;
    private String edition;
    private LocalDate dateofpurchase;
    private String owner;

    public Book(String book_ID, Author author, String title, double price, String edition) {
        this.book_ID = book_ID;
        this.author = author;
        this.title = title;
        this.price = price;
        this.edition = edition;
        this.status = Status.GOOD_CONDITION;
        this.dateofpurchase = LocalDate.now();
        this.owner="Library";
    }

    public String getBook_ID() {
        return book_ID;
    }

    public void setBook_ID(String book_ID) {
        this.book_ID = book_ID;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void update_status(Status status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public LocalDate getDateofpurchase() {
        return dateofpurchase;
    }

    public void setDateofpurchase(LocalDate dateofpurchase) {
        this.dateofpurchase = dateofpurchase;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public abstract void display();

    @Override
    public String toString() {
        return "Book{" +
                "book_ID='" + book_ID + '\'' +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition='" + edition + '\'' +
                ", dateofpurchase=" + dateofpurchase +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(book_ID, book.book_ID) && Objects.equals(author, book.author) && Objects.equals(title, book.title) && Objects.equals(edition, book.edition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book_ID, author, title, edition);
    }
}
