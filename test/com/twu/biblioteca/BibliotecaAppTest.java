package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        bibliotecaApp = new BibliotecaApp();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }

    @Test
    public void should_show_welcome_message_when_star_app() throws IOException {
        bibliotecaApp.showWelcomeWords();
        assertTrue(outContent.toString().contains("Welcome use Biblioteca!"));
    }


    @Test
    public void should_give_a_correct_action_when_user_chose_a_option() throws IOException {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        bibliotecaApp.interAction();
        assertTrue(outContent.toString().contains("There are all the books in our library and can check out:"));


    }

}