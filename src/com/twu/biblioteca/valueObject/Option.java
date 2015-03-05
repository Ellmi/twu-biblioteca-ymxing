package com.twu.biblioteca.valueObject;

/**
 * Created by ymxing on 3/4/15.
 */
public class Option {
    private String optionName;

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public Option(String optionName) {
        this.optionName = optionName;
    }
}
