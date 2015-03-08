package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.Movie;
import com.twu.biblioteca.valueObject.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ymxing on 3/9/15.
 */
public class CheckoutMovieOptionHandler implements OptionHandler{
    @Override
    public void handle(User user) throws IOException {
        if(user == null){
            System.out.println(new AppConfigHelper().getPropertyValue("loginReminder"));
            new UserLoginOptionHandler().handle(user);
        }
        System.out.println("Please enter the movie name which you want to checkout:");
        Scanner scanner = new Scanner(System.in);
        Movie movie = Library.libraryMovies.get(scanner.nextLine());
        if(movie == null || !movie.isCheckoutable()){
            System.out.println(new AppConfigHelper().getPropertyValue("checkoutMovieFaild"));
        }else {
            movie.setCheckoutable(false);
            System.out.println(new AppConfigHelper().getPropertyValue("checkoutMovieSuccessful"));
        }
    }
}
