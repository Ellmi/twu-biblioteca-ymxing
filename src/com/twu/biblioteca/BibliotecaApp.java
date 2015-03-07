package com.twu.biblioteca;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.BookUIImp1;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.WelcomeUIImp1;
import com.twu.biblioteca.valueObject.Book;
import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.Menu;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    private Menu menu =new Menu(new PartTitleUIImp1(),new OptionUIImp1());

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.showWelcomeWords();
        bibliotecaApp.menu.show();
        bibliotecaApp.interAction();

    }

    public void interAction() throws IOException {
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("1")){
        showLibraryBooks();
        }

    }

    public void showWelcomeWords() throws IOException {
        String welcomeWords = new AppConfigHelper().getPropertyValue("welcomeWords");
        System.out.println(new WelcomeUIImp1().uiDesign(welcomeWords));
    }

    public void showLibraryBooks() throws IOException {
        BookUIImp1 bookUIImp1 = new BookUIImp1();
        System.out.print(new PartTitleUIImp1().uiDesign(new AppConfigHelper().getPropertyValue("libraryBooksTitle")));
        for (Book book : Library.libraryBooks) {
            System.out.println(bookUIImp1.uiDesign(book));
        }
    }
}