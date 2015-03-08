package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.valueObject.Library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReturnBookOptionHandlerTest {
    private ReturnBookOptionHandler returnBookOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        returnBookOptionHandler = new ReturnBookOptionHandler();
        System.setOut(new PrintStream(outContent));
        Library.libraryBooks.get("Black Beauty").setCheckoutable(false);
    }

    @After
    public void resetBookStatus() throws Exception {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
    }

    @Test
    public void should_changed_the_book_checkoutable_status_as_true() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        returnBookOptionHandler.handle();
        assertEquals(true,Library.libraryBooks.get("Black Beauty").isCheckoutable());
    }

    @Test
    public void should_give_return_successful_message_when_succeeded() throws IOException {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(false);
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        returnBookOptionHandler.handle();
        assertTrue(outContent.toString().contains("Thank you for returning the book."));
    }
}