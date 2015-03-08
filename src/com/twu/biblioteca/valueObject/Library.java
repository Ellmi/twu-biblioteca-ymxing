package com.twu.biblioteca.valueObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ymxing on 2/22/15.
 */
public class Library {

    public static Map<String,Book> libraryBooks;
    static
    {
        libraryBooks = new HashMap<String, Book>();
        libraryBooks.put("The Boy in the Striped Pyjamas", new Book("The Jungle Book","Peter","Sep 14, 1913"));
        libraryBooks.put("Black Beauty",new Book("Black Beauty","Helen","Apr 24, 1902"));
        libraryBooks.put("The Secret Garden",new Book("The Secret Garden","Follor","Jan 29, 1905"));
        libraryBooks.put("Peter Pan",new Book("Peter Pan","Green","Jan 9, 1910"));
    }
}
