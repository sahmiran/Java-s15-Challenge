package org.challenge.s15.props;

import org.challenge.s15.humans.Author;

public class Magazines extends Book{
    private String category;
    public Magazines(String book_ID, Author author, String title, double price, String edition) {
        super(book_ID, author, title, price, edition);
        category="Magazines";
    }

    @Override
    public void display() {
        String output = super.toString() +
                ", category='" + category + '\'' +
                '}';
        System.out.println(output);
    }
}
