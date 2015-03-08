package com.twu.biblioteca.ui;

import com.twu.biblioteca.valueObject.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieUIImp1Test {

    private MovieUIImp1 movieUIImp1;
    private Movie movie;
    
    @Before
    public void setUp(){
        movieUIImp1 = new MovieUIImp1();
        movieUIImp1.setMovieNumber(3);
        movie = new Movie("movie","today","director",2,true);
    }

    @Test
    public void should_give_a_correct_movie_ui_implement_1(){
        assertEquals("(3)<movie>        -- by director  |  on today   rating:**",movieUIImp1.uiDesign(movie));
    }

    @Test
    public void should_give_a_correct_rating_string(){
        assertEquals("**",movieUIImp1.getRating(movie));

    }
}