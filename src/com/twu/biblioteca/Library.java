package com.twu.biblioteca;

/**
 * Created by ymxing on 2/22/15.
 */
public class Library {
    public static String[] getLibraryBooks() {
        return libraryBooks;
    }

    public static void setLibraryBooks(String[] libraryBooks) {
        Library.libraryBooks = libraryBooks;
    }

    public static String[] libraryBooks = {"The Jungle Book","The Boy in the Striped Pyjamas","Black Beauty","The Secret Garden","Peter Pan"};
}
