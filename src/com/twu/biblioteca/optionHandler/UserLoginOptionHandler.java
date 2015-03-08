package com.twu.biblioteca.optionHandler;

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
    public void handle() throws IOException {
        String userNumber;
        String userPassWord;
        Scanner scanner = new Scanner(System.in);
        userNumber = askForAccount(scanner);
        userPassWord = askForAccountPassword(scanner);
        User user = Library.libraryUsers.get(userNumber);
        if(user!=null && user.getPassworkd().equals(userPassWord)){
            Library.libraryUsers.get(userNumber).setLogined(true);
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
