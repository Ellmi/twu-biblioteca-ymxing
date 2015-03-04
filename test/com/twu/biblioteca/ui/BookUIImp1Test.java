package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookUIImp1Test {

    private BookUIImp1 bookUIImp1;

    @Before
    public void setUp(){
        bookUIImp1 = new BookUIImp1();
        bookUIImp1.setBookNumber(2);
    }

    @Test
    public void should_use_book_ui_implement_1(){
        Book book = new Book("book","ymx","today");
        assertEquals("(2)<book>        -- by ymx  |  on today",bookUIImp1.uiDesign(book));
    }
}