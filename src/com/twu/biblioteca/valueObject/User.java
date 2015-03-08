package com.twu.biblioteca.valueObject;

import java.util.HashMap;

/**
 * Created by ymxing on 3/9/15.
 */
public class User {
    private String userLibraryNumber;
    private String name;
    private String passworkd;
    private String emailAddress;
    private String phoneNumber;
    private boolean logined;
    private HashMap<String,Book> checkoutedBooks;
    private HashMap<String,Movie> checkoutedMovies;

    public User(String userLibraryNumber, String name, String passworkd, String emailAddress, String phoneNumber) {
        this.userLibraryNumber = userLibraryNumber;
        this.name = name;
        this.passworkd = passworkd;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        logined = false;
        checkoutedBooks = new HashMap<String, Book>(){};
        checkoutedMovies = new HashMap<String, Movie>(){};
    }

    public String getUserLibraryNumber() {
        return userLibraryNumber;
    }

    public void setUserLibraryNumber(String userLibraryNumber) {
        this.userLibraryNumber = userLibraryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworkd() {
        return passworkd;
    }

    public void setPassworkd(String passworkd) {
        this.passworkd = passworkd;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HashMap<String, Book> getCheckoutedBooks() {
        return checkoutedBooks;
    }

    public void setCheckoutedBooks(HashMap<String, Book> checkoutedBooks) {
        this.checkoutedBooks = checkoutedBooks;
    }

    public HashMap<String, Movie> getCheckoutedMovies() {
        return checkoutedMovies;
    }

    public void setCheckoutedMovies(HashMap<String, Movie> checkoutedMovies) {
        this.checkoutedMovies = checkoutedMovies;
    }

    public boolean isLogined() {
        return logined;
    }

    public void setLogined(boolean logined) {
        this.logined = logined;
    }
}
