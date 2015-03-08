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
        put("The Jungle Book", new Book("The Jungle Book","Peter","Sep 14, 1913",true));
        put("Black Beauty",new Book("Black Beauty","Helen","Apr 24, 1902",true));
        put("The Secret Garden",new Book("The Secret Garden","Follor","Jan 29, 1905",true));
        put("Peter Pan",new Book("Peter Pan","Green","Jan 9, 1910",true));}
    };

    public final static Map<String,Movie>
        libraryMovies = new HashMap<String,Movie>(){
        {
            put("The Grand Budapest Hotel",new Movie("The Grand Budapest Hotel","March 7, 2014","Wes Anderson",8,true));
            put("Boyhood",new Movie("Boyhood","July 11, 2014","Richard Linklater",6,true));
            put("Interstellar",new Movie("Interstellar","March 31, 2015","Hoyte van Hoytema",9,true));
            put("How to Train Your Dragon 2",new Movie("How to Train Your Dragon 2","June 13, 2014","Dean DeBlois",10,true));
            put("Maleficent",new Movie("Maleficent","May 30, 2014","Robert Stromberg",0,true));
        }
    };

    public final static Map<String,User>
            libraryUsers = new HashMap<String,User>(){
        {
            put("ShengjiLI",new User("010-2222","ShengjiLI","aaaaaa","ShengjiLI@a.com","11111111111"));
            put("MinerSHEN",new User("020-1111","MinerSHEN","bbbbbb","MinerSHEN@b.com","22222222222"));
        }
    };
}
