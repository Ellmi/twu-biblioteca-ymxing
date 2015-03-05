package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Option;

/**
 * Created by ymxing on 3/4/15.
 */
public class OptionUIImp1 implements UI{

    private static int optionNumber = 1;
    private String ui;

    @Override
    public String uiDesign(Object object) {
        Option option = (Option)object;
        ui = "[" + optionNumber +"]" + option.getOptionName();
        optionNumber++;
        return ui;
    }
}
