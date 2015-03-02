package com.twu.biblioteca.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppConfigHelperTest {
    private AppConfigHelper appConfigHelper;

    @Before
    public void set() throws Exception{
        appConfigHelper = new AppConfigHelper();
    }

    @Test
    public void should_return_the_right_property_value(){
        String propertyName = "welcomeWords";
        String propertyValue = appConfigHelper.getPropertyValue(propertyName);
        assertEquals("Welcome use Biblioteca!",propertyValue);
    }

}