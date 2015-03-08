package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.valueObject.Library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckoutMovieOptionHandlerTest {
    private CheckoutMovieOptionHandler checkoutMovieOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        checkoutMovieOptionHandler = new CheckoutMovieOptionHandler();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void resetMovieStatus() throws Exception {
        Library.libraryMovies.get("Interstellar").setCheckoutable(true);
    }

    @Test
    public void should_changed_the_movie_checkoutable_status_as_false() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle();
        assertFalse(Library.libraryMovies.get("Interstellar").isCheckoutable());
    }

    @Test
    public void should_give_checkout_successful_message_when_succeeded() throws IOException {
        Library.libraryMovies.get("Interstellar").setCheckoutable(true);
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle();
        assertTrue(outContent.toString().contains("Thank you! Enjoy the movie."));
    }

    @Test
    public void should_give_checkout_faild_message_when_faild() throws IOException {
        Library.libraryMovies.get("Interstellar").setCheckoutable(false);
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle();
        assertTrue(outContent.toString().contains("That movie is not available."));
    }
}