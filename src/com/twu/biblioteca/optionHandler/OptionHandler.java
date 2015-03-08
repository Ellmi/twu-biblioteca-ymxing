package com.twu.biblioteca.optionHandler;

import com.twu.biblioteca.valueObject.User;

import java.io.IOException;

/**
 * Created by ymxing on 3/6/15.
 */
public interface OptionHandler {
    void handle(User user) throws IOException;
}
