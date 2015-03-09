package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.BibliotecaApp;
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

public class CheckoutBookOptionHandlerTest {

    private CheckoutBookOptionHandler checkoutBookOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private User user;

    @Before
    public void setUp() throws Exception {
        checkoutBookOptionHandler = new CheckoutBookOptionHandler();
        System.setOut(new PrintStream(outContent));
        user = new User("010-2222",null,null,null,null);
        BibliotecaApp.setUser(user);
    }

    @After
    public void resetBookStatus() throws Exception {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
        Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedBooks().clear();
    }

    @Test
    public void should_changed_the_book_checkoutable_status_as_false() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(user);
        assertFalse(Library.libraryBooks.get("Black Beauty").isCheckoutable());
        assertTrue(Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedBooks().containsKey("Black Beauty"));

    }

    @Test
    public void should_not_checkout_the_book_if_the_user_not_login_successful() throws IOException {
        BibliotecaApp.setUser(null);
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(user);
        assertTrue(Library.libraryBooks.get("Black Beauty").isCheckoutable());
        assertFalse(Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedBooks().containsKey("Black Beauty"));
    }

    @Test
    public void should_give_checkout_successful_message_when_succeeded() throws IOException {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(user);
        assertTrue(outContent.toString().contains("Thank you! Enjoy the book."));
    }

    @Test
    public void should_give_checkout_faild_message_when_faild() throws IOException {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(false);
        ByteArrayInputStream in = new ByteArrayInputStream("Black".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle(user);
        assertTrue(outContent.toString().contains("That book is not available."));
    }
}