package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.services.AppConfigHelper;
import com.twu.biblioteca.ui.MovieUIImp1;
import com.twu.biblioteca.ui.PartTitleUIImp1;
import com.twu.biblioteca.valueObject.Library;
import com.twu.biblioteca.valueObject.Movie;
import com.twu.biblioteca.valueObject.User;

import java.io.IOException;

/**
 * Created by ymxing on 3/9/15.
 */
public class ListMoviesOptionHandler implements OptionHandler{
    @Override
    public void handle(User user) throws IOException {
        MovieUIImp1 movieUIImp1 = new MovieUIImp1();
        System.out.print(new PartTitleUIImp1().uiDesign(new AppConfigHelper().getPropertyValue("libraryMoviesTitle")));
        for (Movie movie : Library.libraryMovies.values()) {
            if(movie.isCheckoutable()){
                System.out.println(movieUIImp1.uiDesign(movie));
            }
        }
    }
}
