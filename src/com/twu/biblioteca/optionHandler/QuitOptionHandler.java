package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.services.AppConfigHelper;

import java.io.IOException;

/**
 * Created by ymxing on 3/7/15.
 */
public class QuitOptionHandler implements OptionHandler{

    @Override
    public void handle() throws IOException {
        System.out.println(new AppConfigHelper().getPropertyValue("quitMessage"));
        System.exit(0);
    }
}
