package org.challenge.s15.humans;

import org.challenge.s15.interfaces.BookOperation;
import org.challenge.s15.props.Book;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person implements BookOperation {
    private Set<Book> books;

    public Author(String name) {
        super(name);
        books = new HashSet<>();
    }

    @Override
    public void whoareyou() {
        System.out.println("This is Author "+getName());
    }

    @Override
    public void new_book(Book book) {
        if(book==null){
            System.out.println("Book can't be null");
        }
        boolean added = books.add(book);
        if(added){
            System.out.println("Book("+book.getTitle()+") added to Author: "+getName());
        }
        else{
            System.out.println("Could not add the book: "+book.getTitle());
        }
    }

    @Override
    public void show_book() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return super.toString()+
        "books='" + books + '\'' +
                '}';
    }
}
