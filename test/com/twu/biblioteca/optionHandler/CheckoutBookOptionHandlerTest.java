package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.valueObject.Library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.assertFalse;

public class CheckoutBookOptionHandlerTest {

    private CheckoutBookOptionHandler checkoutBookOptionHandler;

    @Before
    public void setUp() throws Exception {
        checkoutBookOptionHandler = new CheckoutBookOptionHandler();
    }

    @After
    public void resetBookStatus() throws Exception {
        Library.libraryBooks.get("Black Beauty").setCheckoutable(true);
    }

    @Test
    public void should_changed_the_book_checkoutable_status_as_false() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Black Beauty".getBytes());
        System.setIn(in);
        checkoutBookOptionHandler.handle();
        assertFalse(Library.libraryBooks.get("Black Beauty").isCheckoutable());
    }
}