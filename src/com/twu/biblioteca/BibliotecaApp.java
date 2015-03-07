package com.twu.biblioteca;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.WelcomeUIImp1;
import com.twu.biblioteca.valueObject.menu.MainMenu;
import com.twu.biblioteca.valueObject.menu.Menu;

import java.io.IOException;
import java.util.Scanner;

public class BibliotecaApp {

    private Menu mainMenu =new MainMenu(new PartTitleUIImp1(),new OptionUIImp1());

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.showWelcomeWords();
        bibliotecaApp.mainMenu.show();
        bibliotecaApp.interAction();

    }

    public void interAction() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int userCommand = Integer.parseInt(scanner.nextLine());
        while (userCommand <1 ||userCommand > mainMenu.getOptions().size()){
            System.out.println(new AppConfigHelper().getPropertyValue("validOptionReminder"));
            mainMenu.show();
            userCommand = Integer.parseInt(scanner.nextLine());
        }
        mainMenu.getOptions().get(userCommand-1).getOptionHandler().handle();
    }

    public void showWelcomeWords() throws IOException {
        String welcomeWords = new AppConfigHelper().getPropertyValue("welcomeWords");
        System.out.println(new WelcomeUIImp1().uiDesign(welcomeWords));
    }
}