package com.twu.biblioteca.ui;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListBooksUIImp1Test {

    private ListBooksUIImp1 listBooksUIImp1;

    @Before
    public void setUp(){
        listBooksUIImp1 = new ListBooksUIImp1();
    }

    @Test
    public void should_use_list_books_ui_implement_1(){
        String listBooksTitleMoke = "List books:";
        assertEquals("\n*List books:\n\n",listBooksUIImp1.uiDesign(listBooksTitleMoke));
    }

}