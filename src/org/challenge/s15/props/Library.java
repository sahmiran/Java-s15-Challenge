package org.challenge.s15.props;

import org.challenge.s15.humans.Reader;


import java.util.HashMap;
import java.util.Map;

public class Library  {
    Map<Integer,Book> books;
    Map<Integer, Reader> readers;

    public Library() {
        this.books = new HashMap<>();
        this.readers = new HashMap<>();
    }

    public Map<Integer, Book> getBooks() {
        return books;
    }

    public Map<Integer, Reader> getReaders() {
        return readers;
    }


    public void new_book(int id,Book book) {
        books.put(id,book);
    }

    public void lend_book(int id,Book book){
        books.remove(id,book);
    }
    public void take_back_book(int id,Book book){
        book.setOwner("Library");
        books.put(id,book);

    }


    public void show_book() {
        books.entrySet().stream()
                .forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Book: " + entry.getValue()));
    }
}
