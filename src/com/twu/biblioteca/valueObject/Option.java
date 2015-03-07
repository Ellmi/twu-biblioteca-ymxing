package com.twu.biblioteca.valueObject;

import com.twu.biblioteca.optionHandler.OptionHandler;

/**
 * Created by ymxing on 3/4/15.
 */
public class Option {
    private String optionName;
    private int optionNumber;
    private OptionHandler optionHandler;

    public Option(int optionNumber, String optionName,  OptionHandler optionHandler) {
        this.optionName = optionName;
        this.optionNumber = optionNumber;
        this.optionHandler = optionHandler;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(int optionNumber) {
        this.optionNumber = optionNumber;
    }

    public OptionHandler getOptionHandler() {
        return optionHandler;
    }

    public void setOptionHandler(OptionHandler optionHandler) {
        this.optionHandler = optionHandler;
    }
}
