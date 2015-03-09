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

public class CheckoutMovieOptionHandlerTest {
    private CheckoutMovieOptionHandler checkoutMovieOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private User user;

    @Before
    public void setUp() throws Exception {
        checkoutMovieOptionHandler = new CheckoutMovieOptionHandler();
        System.setOut(new PrintStream(outContent));
        user = new User("010-2222",null,null,null,null);
        BibliotecaApp.setUser(user);
    }

    @After
    public void resetMovieStatus() throws Exception {
        Library.libraryMovies.get("Interstellar").setCheckoutable(true);
        Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedMovies().clear();
    }

    @Test
    public void should_changed_the_movie_checkoutable_status_as_false() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle(user);
        assertFalse(Library.libraryMovies.get("Interstellar").isCheckoutable());
        assertTrue(Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedMovies().containsKey("Interstellar"));
    }

    @Test
    public void should_not_checkout_the_movie_if_the_user_not_login_successful() throws IOException {
        BibliotecaApp.setUser(null);
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle(user);
        assertTrue(Library.libraryMovies.get("Interstellar").isCheckoutable());
        assertFalse(Library.libraryUsers.get(user.getUserLibraryNumber()).getCheckoutedMovies().containsKey("Interstellar"));
    }

    @Test
    public void should_give_checkout_successful_message_when_succeeded() throws IOException {
        Library.libraryMovies.get("Interstellar").setCheckoutable(true);
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle(user);
        assertTrue(outContent.toString().contains("Thank you! Enjoy the movie."));
    }

    @Test
    public void should_give_checkout_faild_message_when_faild() throws IOException {
        Library.libraryMovies.get("Interstellar").setCheckoutable(false);
        ByteArrayInputStream in = new ByteArrayInputStream("Interstellar".getBytes());
        System.setIn(in);
        checkoutMovieOptionHandler.handle(user);
        assertTrue(outContent.toString().contains("That movie is not available."));
    }
}