package com.twu.biblioteca.ui;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeUIImp1Test {

    private WelcomeUIImp1 welcomeUIImp1;

    @Before
    public void setUp(){
        welcomeUIImp1 = new WelcomeUIImp1();
    }

    @Test
    public void should_use_welcome_ui_implement_1(){
        String welcomeWordsMoke = "welcome!";
        assertEquals("########################\n####    welcome!    ####\n########################",welcomeUIImp1.uiDesign(welcomeWordsMoke));
    }
}