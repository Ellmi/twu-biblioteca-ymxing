package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.UserUIImp1;
import com.twu.biblioteca.valueObject.User;

import java.io.IOException;

/**
 * Created by ymxing on 3/9/15.
 */
public class ShowUserInformationOptionHandler implements OptionHandler{
    @Override
    public void handle(User user) throws IOException {
        UserUIImp1 userUIImp1 = new UserUIImp1();
        if(user == null){
            System.out.println(new AppConfigHelper().getPropertyValue("loginReminder"));
            new UserLoginOptionHandler().handle(null);
        }
        if(BibliotecaApp.getUser() == null){return;}
        System.out.println(userUIImp1.uiDesign(BibliotecaApp.getUser()));
    }
}
