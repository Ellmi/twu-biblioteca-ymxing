package com.twu.biblioteca.optionHandler;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class QuitOptionHandlerTest {
    private QuitOptionHandler quitOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        quitOptionHandler = new QuitOptionHandler();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_exit_when_user_choose_quit_option() throws IOException {
        quitOptionHandler.handle();
    }
}