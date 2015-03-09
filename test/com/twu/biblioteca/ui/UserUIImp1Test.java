package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserUIImp1Test {
    private UserUIImp1 userUIImp1;

    @Before
    public void setUp(){
        userUIImp1 = new UserUIImp1();
    }

    @Test
    public void should_use_part_title_ui_implement_1(){
        User user = new User("010-2222","ShengjiLI","aaaaaa","ShengjiLI@a.com","11111111111");
        assertEquals("USER INFO: [*ShengjiLI*]     email:ShengjiLI@a.com     phone:11111111111", userUIImp1.uiDesign(user));
    }

}