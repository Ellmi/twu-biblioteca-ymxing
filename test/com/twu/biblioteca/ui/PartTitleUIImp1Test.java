package com.twu.biblioteca.ui;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PartTitleUIImp1Test {

    private PartTitleUIImp1 partTitleUIImp1;

    @Before
    public void setUp(){
        partTitleUIImp1 = new PartTitleUIImp1();
    }

    @Test
    public void should_use_part_title_ui_implement_1(){
        String listBooksPartTitleMoke = "List books:";
        assertEquals("\n##List books:\n\n", partTitleUIImp1.uiDesign(listBooksPartTitleMoke));
    }

}