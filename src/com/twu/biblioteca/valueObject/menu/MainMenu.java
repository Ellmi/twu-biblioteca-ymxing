package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.optionHandler.ListBooksOptionHandler;
import com.twu.biblioteca.optionHandler.QuitOptionHandler;
import com.twu.biblioteca.ui.UI;

/**
 * Created by ymxing on 3/7/15.
 */
public class MainMenu extends Menu {

    public MainMenu(UI titleUI, UI optionUI) {
        super(titleUI, optionUI);
    }

    @Override
    public final void constructMenu() {
        addOption("List Books", new ListBooksOptionHandler());
        addOption("Quit", new QuitOptionHandler());
    }
}
