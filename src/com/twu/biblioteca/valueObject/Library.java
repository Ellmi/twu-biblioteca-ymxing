package com.twu.biblioteca.valueObject;

/**
 * Created by ymxing on 2/22/15.
 */
public class Library {
    public static Book[] getLibraryBooks() {
        return libraryBooks;
    }

    public static void setLibraryBooks(Book[] libraryBooks) {
        Library.libraryBooks = libraryBooks;
    }

    public static Book[] libraryBooks = {new Book("The Jungle Book","Peter","Sep 14, 1913"),
            new Book("The Boy in the Striped Pyjamas","Tom","Mar 1, 1989"),
            new Book("Black Beauty","Helen","Apr 24, 1902"),
            new Book("The Secret Garden","Follor","Jan 29, 1905"),
            new Book("Peter Pan","Green","Jan 9, 1910")};
}
