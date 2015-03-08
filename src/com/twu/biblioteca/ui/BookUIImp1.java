package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Book;

/**
 * Created by ymxing on 3/4/15.
 */
public class BookUIImp1 implements UI{

    private int bookNumber = 1;
    private String ui;

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    @Override
    public String uiDesign(Object object) {
        Book book = (Book)object;
        ui = "(" + bookNumber +")" + "<"+book.getBookName()+">" + "        -- by " + book.getBookAuthor() + "  |  on " + book.getYearPublished();
        bookNumber++;
        return ui;
    }
}
