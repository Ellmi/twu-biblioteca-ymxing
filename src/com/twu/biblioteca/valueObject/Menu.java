package com.twu.biblioteca.valueObject;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;

import java.io.IOException;

/**
 * Created by ymxing on 3/4/15.
 */
public class Menu {
    public static Option[] options = {new Option("ListBooks")};
    public void show() throws IOException {
        System.out.print(new PartTitleUIImp1().uiDesign(new AppConfigHelper().getPropertyValue("optionMenuTitle")));
        for (Option option : options) {
            System.out.println(new OptionUIImp1().uiDesign(option));
        }
    }
}
