package org.example;

public class LibraryItem {
    // protected fields for inheritance
    protected String title;
    protected int year;
    protected String author;

    // Constructors for LibraryItem obj
    public LibraryItem(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    // getter to access fields
    public  String getTitle() {
        return title;
    }

    public  int getYear() {
        return year;
    }

    public  String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Library Item: " + title + " by " + author + " in " + year;
    }
}
