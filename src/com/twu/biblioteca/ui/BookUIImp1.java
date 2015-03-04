package com.twu.biblioteca.ui;

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
        String bookName = (String)object;
        ui = "[" + bookNumber +"]" + bookName;
        bookNumber++;
        return ui;
    }
}
