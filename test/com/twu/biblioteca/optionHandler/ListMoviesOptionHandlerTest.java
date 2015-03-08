package com.twu.biblioteca.optionHandler;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class ListMoviesOptionHandlerTest {
    private ListMoviesOptionHandler listMoviesOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp(){
        listMoviesOptionHandler = new ListMoviesOptionHandler();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_show_library_movies_list() throws IOException {
        listMoviesOptionHandler.handle(null);
        assertTrue(outContent.toString().contains("There are all the movies in our library and can check out:"));
        assertTrue(outContent.toString().contains("Interstellar"));
        assertTrue(outContent.toString().contains("Hoyte van Hoytema"));
        assertTrue(outContent.toString().contains("March 31, 2015"));
        assertTrue(outContent.toString().contains("*********"));
    }

}