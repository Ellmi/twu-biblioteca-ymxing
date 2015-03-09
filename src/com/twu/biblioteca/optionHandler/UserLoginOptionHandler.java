package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ymxing on 3/9/15.
 */
public class UserLoginOptionHandler implements OptionHandler {
    @Override
    public void handle(User user) throws IOException {
        if(user != null){
            System.out.println("You have logined!");
            return;
        }
        String userNumber;
        String userPassWord;
        Scanner scanner = new Scanner(System.in);
        userNumber = askForAccount(scanner);
        userPassWord = askForAccountPassword(scanner);
        User userWantLogin = Library.libraryUsers.get(userNumber);
        if(userWantLogin!=null && userWantLogin.getPassworkd().equals(userPassWord)){
            Library.libraryUsers.get(userNumber).setLogined(true);
            BibliotecaApp.setUser(userWantLogin);
            System.out.println(new AppConfigHelper().getPropertyValue("loginSuccessful"));
        }else {
            System.out.println(new AppConfigHelper().getPropertyValue("loginError"));
        }
    }

    private String askForAccountPassword(Scanner scanner) throws IOException {
        String userPassWord;
        System.out.println(new AppConfigHelper().getPropertyValue("askForPassWord"));
        userPassWord = scanner.nextLine();
        return userPassWord;
    }

    private String askForAccount(Scanner scanner) throws IOException {
        String userNumber;
        System.out.println(new AppConfigHelper().getPropertyValue("askForUserAccount"));
        userNumber = scanner.nextLine();
        return userNumber;
    }
}
