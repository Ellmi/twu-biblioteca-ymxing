package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Book;

/**
 * Created by ymxing on 3/4/15.
 */
public class BookUIImp1 implements UI{

    private static int bookNumber = 1;
    private String ui;

    public static int getBookNumber() {
        return bookNumber;
    }

    public static void setBookNumber(int bookNumber) {
        BookUIImp1.bookNumber = bookNumber;
    }

    @Override
    public String uiDesign(Object object) {
        Book book = (Book)object;
        ui = "[" + bookNumber +"]" + book.getBookName() + "  |  by " + book.getBookAuthor() + "  |  on " + book.getYearPublished();
        bookNumber++;
        return ui;
    }
}
