package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Movie;

/**
 * Created by ymxing on 3/9/15.
 */
public class MovieUIImp1 implements UI{
    private int movieNumber = 1;
    private String ui;

    public int getMovieNumber() {
        return movieNumber;
    }

    public void setMovieNumber(int movieNumber) {
        this.movieNumber = movieNumber;
    }

    @Override
    public String uiDesign(Object object) {
        Movie movie = (Movie)object;
        ui = "(" + movieNumber +")" + "<"+movie.getMovieName() + ">" + "        -- by " + movie.getDirector() + "  |  on " + movie.getYear() + getRating(movie);
        movieNumber++;
        return ui;
    }

    public String getRating(Movie movie) {
        String rating;
        if(movie.getRating()==0){
            rating = "   unrated";
            return rating;
        }else {rating = "   rating:";}
        for(int starAccount = 0;starAccount<movie.getRating();starAccount++){
            rating += "*";
        }
        return rating;
    }
}
