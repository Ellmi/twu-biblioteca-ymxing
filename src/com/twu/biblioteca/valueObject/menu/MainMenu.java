package com.twu.biblioteca.valueObject.menu;

import com.twu.biblioteca.optionHandler.*;
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
        addOption("Checkout Book", new CheckoutBookOptionHandler());
        addOption("Return book", new ReturnBookOptionHandler());
        addOption("List Movies", new ListMoviesOptionHandler());
        addOption("Checkout Movie", new CheckoutMovieOptionHandler());
        addOption("User Login", new UserLoginOptionHandler());
        addOption("Quit", new QuitOptionHandler());
    }
}
