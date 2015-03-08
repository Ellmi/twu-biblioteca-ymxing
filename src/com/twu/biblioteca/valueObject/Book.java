package com.twu.biblioteca.valueObject;

/**
 * Created by ymxing on 3/4/15.
 */
public class Book {
    private String bookName;
    private String bookAuthor;
    private String yearPublished;
    private boolean checkoutable;

    public Book(String bookName,String bookAuthor,String date,boolean checkoutable){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublished = date;
        this.checkoutable = checkoutable;
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

    public boolean isCheckoutable() {
        return checkoutable;
    }

    public void setCheckoutable(boolean checkoutable) {
        this.checkoutable = checkoutable;
    }
}
