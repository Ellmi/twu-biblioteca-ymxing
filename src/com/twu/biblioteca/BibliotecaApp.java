package com.twu.biblioteca;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.BookUIImp1;
import com.twu.biblioteca.ui.ListBooksUIImp1;
import com.twu.biblioteca.ui.WelcomeUIImp1;
import com.twu.biblioteca.valueObject.Book;
import com.twu.biblioteca.valueObject.Library;

import java.io.IOException;

public class BibliotecaApp {

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.showWelcomeWords();
        bibliotecaApp.showLibraryBooks();

    }

    public void showWelcomeWords() throws IOException {
        String welcomeWords = new AppConfigHelper().getPropertyValue("welcomeWords");
        System.out.println(new WelcomeUIImp1().uiDesign(welcomeWords));
    }

    public void showLibraryBooks() throws IOException {
        BookUIImp1 bookUIImp1 = new BookUIImp1();
        System.out.print(new ListBooksUIImp1().uiDesign(new AppConfigHelper().getPropertyValue("libraryBooksTitle")));
        for (Book book : Library.libraryBooks) {
            System.out.println(bookUIImp1.uiDesign(book));
        }
    }
}