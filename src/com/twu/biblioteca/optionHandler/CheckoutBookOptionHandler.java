package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.valueObject.Book;
import com.twu.biblioteca.valueObject.Library;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ymxing on 3/8/15.
 */
public class CheckoutBookOptionHandler implements OptionHandler {
    @Override
    public void handle() throws IOException {
        System.out.println("Please enter the book name which you want to checkout:");
        Scanner scanner = new Scanner(System.in);
        Book book = Library.libraryBooks.get(scanner.nextLine());
        book.setCheckoutable(false);
        System.out.println(new AppConfigHelper().getPropertyValue("checkoutSuccessful"));
    }
}
