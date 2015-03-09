package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.BibliotecaApp;
import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.valueObject.Book;
import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ymxing on 3/8/15.
 */
public class ReturnBookOptionHandler implements OptionHandler{


    @Override
    public void handle(User user) throws IOException {
        if(user == null){
            System.out.println(new AppConfigHelper().getPropertyValue("loginReminder"));
            new UserLoginOptionHandler().handle(null);
        }
        if(BibliotecaApp.getUser() == null){return;}
        System.out.println("Please enter the book name which you want to return:");
        Scanner scanner = new Scanner(System.in);
        Book book = Library.libraryBooks.get(scanner.nextLine());
        if(book == null || book.isCheckoutable()){
            System.out.println(new AppConfigHelper().getPropertyValue("returnFaild"));
        }else {
            book.setCheckoutable(true);
            Library.libraryUsers.get(BibliotecaApp.getUser().getUserLibraryNumber()).getCheckoutedBooks().remove(book.getBookName());
            System.out.println(new AppConfigHelper().getPropertyValue("returnSuccessful"));
        }
    }
}
