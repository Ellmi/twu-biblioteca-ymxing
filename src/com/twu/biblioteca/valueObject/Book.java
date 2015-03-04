package com.twu.biblioteca.valueObject;

/**
 * Created by ymxing on 3/4/15.
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;

    public Book(String bookName,String bookAuthor,String date){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = date;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(String yearPublished) {
        this.yearPublished = yearPublished;
    }
}
