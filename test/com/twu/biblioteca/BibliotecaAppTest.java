package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {

    private BibliotecaApp bibliotecaApp;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private String[] libraryBooks;

    @Before
    public void setUp() throws Exception {
        bibliotecaApp = new BibliotecaApp();
        System.setOut(new PrintStream(outContent));
        libraryBooks = new String[5];
        libraryBooks[0] = "The Jungle Book";
        libraryBooks[1] = "The Boy in the Striped Pyjamas";
        libraryBooks[2] = "Black Beauty";
        libraryBooks[3] = "The Secret Garden";
        libraryBooks[4] = "Peter Pan";
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void should_show_welcome_message_when_star_app() throws IOException {
        bibliotecaApp.showWelcomeWords();
        assertEquals("Welcome use Biblioteca!\n", outContent.toString());
    }

    @Test
    public void should_show_library_books_list(){
        String libraryBooksString = "";
        bibliotecaApp.showLibraryBooks();
        for(int i=0;i<libraryBooks.length;i++){
            libraryBooksString +=libraryBooks[i]+"\n";
        }
        assertEquals(libraryBooksString,outContent.toString());
    }

}