package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class CheckoutBookOptionHandlerTest {

    private CheckoutBookOptionHandler checkoutBookOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private User mockUser;

    @Before
    public void setUp() throws Exception {
        checkoutBookOptionHandler = new CheckoutBookOptionHandler();
        System.setOut(new PrintStream(outContent));
        mockUser = mock(User.class);
    }

    @After
    public void resetBookStatus() throws Exception {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
    }

    @Test
    public void should_changed_the_book_checkoutable_status_as_false() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(mockUser);
        assertFalse(Library.libraryBooks.get("Black Beauty").isCheckoutable());
    }

    @Test
    public void should_give_checkout_successful_message_when_succeeded() throws IOException {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(mockUser);
        assertTrue(outContent.toString().contains("Thank you! Enjoy the book."));
    }

    @Test
    public void should_give_checkout_faild_message_when_faild() throws IOException {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(false);
        ByteArrayInputStream in = new ByteArrayInputStream("Black".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(mockUser);
        assertTrue(outContent.toString().contains("That book is not available."));
    }
}