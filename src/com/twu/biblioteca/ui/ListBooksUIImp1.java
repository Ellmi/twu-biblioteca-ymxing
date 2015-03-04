package com.twu.biblioteca.ui;

/**
 * Created by ymxing on 3/4/15.
 */
public class ListBooksUIImp1 implements UI {
    private String ui = "";
    @Override
    public String uiDesign(Object object) {
        String listBooksTitle = (String)object;
        ui = "\n" + "*" + listBooksTitle +"\n\n";
        return ui;
    }
}
