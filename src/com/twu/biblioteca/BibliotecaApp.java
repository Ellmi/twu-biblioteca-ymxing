package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.showWelcomeWords();
        bibliotecaApp.showLibraryBooks();

    }

    public void showWelcomeWords() {
        String welcomeWords = "Welcome use Biblioteca!";
        System.out.println(welcomeWords);
    }

    public void showLibraryBooks() {
        for (String book : Library.libraryBooks) {
            System.out.println(book);
        }
    }
}