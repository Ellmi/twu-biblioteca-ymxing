package com.twu.biblioteca.optionHandler;

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
        Library.libraryBooks.get(scanner.nextLine()).setCheckoutable(false);
    }
}
