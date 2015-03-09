package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.valueObject.User;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class ShowUserInformationOptionHandlerTest {

    private ShowUserInformationOptionHandler showUserInformationOptionHandler;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private User user;

    @Before
    public void setUp() throws Exception {
        showUserInformationOptionHandler = new ShowUserInformationOptionHandler();
        System.setOut(new PrintStream(outContent));
        user = new User(null,"xiaohong",null,null,null);
        BibliotecaApp.setUser(user);
    }

    @Test
    public void should_changed_the_book_checkoutable_status_as_false() throws IOException {
        showUserInformationOptionHandler.handle(user);
        assertTrue(outContent.toString().contains("xiaohong"));

    }
}