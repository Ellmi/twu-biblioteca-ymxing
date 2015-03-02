package com.twu.biblioteca;

import com.twu.biblioteca.services.AppConfigHelper;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.showWelcomeWords();
        bibliotecaApp.showLibraryBooks();

    }

    public void showWelcomeWords() throws IOException {
        String welcomeWords = new AppConfigHelper().getPropertyValue("welcomeWords");
        System.out.println(welcomeWords);
    }

    public void showLibraryBooks() {
        for (String book : Library.libraryBooks) {
            System.out.println(book);
        }
    }
}