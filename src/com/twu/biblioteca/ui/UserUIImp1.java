package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.User;

/**
 * Created by ymxing on 3/9/15.
 */
public class UserUIImp1 implements UI {
    private String ui;

    @Override
    public String uiDesign(Object object) {
        User user = (User)object;
        ui = "[*" + user.getName() +"*]" + "     email:"+user.getEmailAddress() + "     phone:" + user.getPhoneNumber();
        return ui;
    }
}
