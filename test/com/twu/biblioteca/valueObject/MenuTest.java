package com.twu.biblioteca.valueObject;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class MenuTest {

    private Menu menu;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void senUp(){
        menu = new Menu();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_show_the_biblioteca_options_menu() throws IOException {
        menu.show();
        assertTrue(outContent.toString().contains("This is options menu,please pick one option by type the number:"));
        assertTrue(outContent.toString().contains("ListBooks"));
    }

}