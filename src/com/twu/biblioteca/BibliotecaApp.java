package com.twu.biblioteca;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.WelcomeUIImp1;
import com.twu.biblioteca.valueObject.User;
import com.twu.biblioteca.valueObject.menu.MainMenu;
import com.twu.biblioteca.valueObject.menu.Menu;

import java.io.IOException;

public class BibliotecaApp {
    private static User user = null;

    public static void main(String[] args) throws IOException {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.run();
    }

    public void run() throws IOException {
        int userCommand;
        showWelcomeWords();
        Menu mainMenu =new MainMenu(new PartTitleUIImp1(),new OptionUIImp1());
        mainMenu.show();
        userCommand=mainMenu.readNextCommand();
        while (userCommand != mainMenu.getOptions().size()){
            mainMenu.interActOption(mainMenu.askForAValidSelection(userCommand),user);
            mainMenu.show();
            userCommand = mainMenu.readNextCommand();
        }
    }

    public void showWelcomeWords() throws IOException {
        String welcomeWords = new AppConfigHelper().getPropertyValue("welcomeWords");
        System.out.println(new WelcomeUIImp1().uiDesign(welcomeWords));
    }


}