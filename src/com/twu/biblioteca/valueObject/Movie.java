package com.twu.biblioteca.valueObject;

/**
 * Created by ymxing on 3/9/15.
 */
public class Movie {
    private String movieName;
    private String year;
    private String director;
    private int rating;
    private boolean checkoutable;

    public Movie(String movieName, String year, String director, int rating, boolean checkoutable) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkoutable = checkoutable;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckoutable() {
        return checkoutable;
    }

    public void setCheckoutable(boolean checkoutable) {
        this.checkoutable = checkoutable;
    }
}
