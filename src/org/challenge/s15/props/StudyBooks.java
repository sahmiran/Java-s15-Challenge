package org.challenge.s15.props;

import org.challenge.s15.humans.Author;

public class StudyBooks extends Book{
    private String category;
    public StudyBooks(String book_ID, Author author, String title, double price, String edition) {
        super(book_ID, author, title, price, edition);
        category="StudyBook";
    }

    @Override
    public void display() {
        String output = super.toString() +
                ", category='" + category + '\'' +
                '}';
        System.out.println(output);
    }
}
