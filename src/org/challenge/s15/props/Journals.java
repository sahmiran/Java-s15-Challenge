package org.challenge.s15.props;

import org.challenge.s15.humans.Author;

public class Journals extends Book{
    private String category;
    public Journals(String book_ID, Author author, String title, double price, String edition) {
        super(book_ID, author, title, price, edition);
        category="Journal";
    }

    @Override
    public void display() {
        String output = super.toString() +
                ", category='" + category + '\'' +
                '}';
        System.out.println(output);
    }
}
