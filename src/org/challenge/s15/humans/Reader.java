package org.challenge.s15.humans;

import org.challenge.s15.interfaces.Whoareyou;
import org.challenge.s15.props.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person implements Whoareyou {
    List<Book> books;

    public Reader(String name) {
        super(name);
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void purchase_book(Book book){
        if(book==null){
            System.out.println("Book can't be null");
        }
        if(books.size()<=5 && books.size()>=0) {
            boolean added = books.add(book);
            if (added) {
                System.out.println("Book(" + book.getTitle() + ") has been purchased");
                book.setOwner(getName());
                //kitap veri tabanı olsaydı oradanda çıkaracaktım ama nasıl eklerim bilmiyorum
            } else {
                System.out.println("Could not purchase the book: " + book.getTitle());
            }
        }else{
            System.out.println("Can't have more than 5 books");
        }
    }
    public void borrow_book(Book book){
        if(book==null){
            System.out.println("Book can't be null");
        }
        if(books.size()<=5 && books.size()>=0) {
            boolean added = books.add(book);
            if (added) {
                System.out.println("Book(" + book.getTitle() + ") has been borrowed");
            } else {
                System.out.println("Could not borrow the book: " + book.getTitle());
            }
        }else{
            System.out.println("Can't have more than 5 books");
        }
    }
    public void return_book(Book book){
        if(book==null){
            System.out.println("Book can't be null");
        }
        if(books.contains(book)){
            book.setOwner("Library");
            books.remove(book);
        }
    }

    public void show_book() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public void whoareyou() {
        System.out.println("This is Reader "+getName());
    }
}
