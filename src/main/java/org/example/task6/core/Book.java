package org.example.task6.core;

public class Book {

    private String bookName;
    private String author;

    public Book() {

    }

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return author + " – " + bookName;
    }
}
