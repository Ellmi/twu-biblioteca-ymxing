package com.twu.biblioteca.valueObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ymxing on 2/22/15.
 */
public class Library {

    public final static Map<String,Book>
        libraryBooks = new HashMap<String, Book>(){
        {
        put("The Boy in the Striped Pyjamas", new Book("The Jungle Book","Peter","Sep 14, 1913",true));
        put("Black Beauty",new Book("Black Beauty","Helen","Apr 24, 1902",true));
        put("The Secret Garden",new Book("The Secret Garden","Follor","Jan 29, 1905",true));
        put("Peter Pan",new Book("Peter Pan","Green","Jan 9, 1910",true));}
    };
}
