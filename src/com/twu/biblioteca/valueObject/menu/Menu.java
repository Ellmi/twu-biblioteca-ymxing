package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.optionHandler.OptionHandler;
import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.OptionUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.ui.UI;
import com.twu.biblioteca.valueObject.Option;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ymxing on 3/4/15.
 */
public class Menu {

    private int itemNumber = 0;
    private ArrayList<Option> options = new ArrayList<Option>();
    private UI titleUI = new PartTitleUIImp1();
    private UI optionUI = new OptionUIImp1();

    public Menu(UI titleUI, UI optionUI) {
        this.titleUI = titleUI;
        this.optionUI = optionUI;
        constructMenu();
    }

    public void show() throws IOException {
        System.out.print(titleUI.uiDesign(new AppConfigHelper().getPropertyValue("optionMenuTitle")));
        for (Option option : options) {
            System.out.println(optionUI.uiDesign(option));
        }
    }

    public void constructMenu(){}

    public void addOption(String optionName,OptionHandler optionHandler){
        itemNumber++;
        options.add(new Option(itemNumber,optionName,optionHandler));

    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    public UI getOptionUI() {
        return optionUI;
    }

    public void setOptionUI(UI optionUI) {
        this.optionUI = optionUI;
    }

    public UI getTitleUI() {
        return titleUI;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setTitleUI(UI titleUI) {
        this.titleUI = titleUI;
    }

}
