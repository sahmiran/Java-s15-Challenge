package org.challenge.s15.humans;

import org.challenge.s15.enums.Status;
import org.challenge.s15.props.Book;
import org.challenge.s15.props.Library;

import java.time.LocalDate;
import java.time.Period;

public class Librarian {
    private String name;
    private String password;
    private Library library;

    public Librarian(String name, String password, Library library) {
        this.name = name;
        this.password = password;
        this.library = library;
    }

    public void search_book(Book book){
        boolean search = library.getBooks().containsValue(book);
        System.out.println("Book "+book.getTitle()+" is in the library");
    }
    public void verify_member(int id,Reader reader){
        library.getReaders().put(id,reader);
        System.out.println("Reader "+reader.getName()+" is verrified.");
    }
    public void issue_book(int id,Book book){
        library.getBooks().put(id,book);
    }
    public double calculate_fine(Book book){
        LocalDate date = LocalDate.of(2024, 8, 29);
        Period period = Period.between(book.getDateofpurchase(), date);

        int daysBetween = period.getDays() + period.getMonths() * 30 + period.getYears() * 365;
        int fine =(daysBetween-5)*10;
        if(fine<0){
            fine=0;
        }
        if(book.getStatus().equals(Status.MEDIUM_CONDITION)){
            fine+=50;
        }
        else if(book.getStatus().equals(Status.BAD_CONDITION)){
            fine+=100;
        }
        System.out.println("Fine = "+fine);
        return fine;
    }
    public double create_bill(Book book){
        double bill =book.getPrice()+calculate_fine(book);
        System.out.println("Bill = "+bill);
        return bill;
    }
    public void return_book(int id,Book book,Reader reader){
        book.setOwner("Library");
        reader.getBooks().remove(book);
        library.getBooks().put(id,book);
    }
}
