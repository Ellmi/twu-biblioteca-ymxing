package com.twu.biblioteca.optionHandler;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class ListBooksOptionHandlerTest {

    private ListBooksOptionHandler listBooksOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        listBooksOptionHandler = new ListBooksOptionHandler();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_show_library_books_list() throws IOException {
        listBooksOptionHandler.handle(null);
        assertTrue(outContent.toString().contains("There are all the books in our library and can check out:"));
        assertTrue(outContent.toString().contains("The Jungle Book"));
        assertTrue(outContent.toString().contains("Peter"));
        assertTrue(outContent.toString().contains("Sep 14, 1913"));
    }
}