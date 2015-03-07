package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.BookUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.valueObject.Book;
import com.twu.biblioteca.valueObject.Library;

import java.io.IOException;

/**
 * Created by ymxing on 3/7/15.
 */
public class ListBooksOptionHandler implements OptionHandler {
    @Override
    public void handle() throws IOException {
        BookUIImp1 bookUIImp1 = new BookUIImp1();
        System.out.print(new PartTitleUIImp1().uiDesign(new AppConfigHelper().getPropertyValue("libraryBooksTitle")));
        for (Book book : Library.libraryBooks) {
            System.out.println(bookUIImp1.uiDesign(book));
        }
    }
}
