package com.twu.biblioteca.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by ymxing on 3/3/15.
 */
public class AppConfigHelper{
    private final static String FILE_KEY = "application.properties";
    private Properties properties;

    public AppConfigHelper() throws IOException {
        properties = getProperties(FILE_KEY);
    }

    public String getPropertyValue(String propertyName) {
        return properties.getProperty(propertyName);
    }

    private Properties getProperties(String configFileKey) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(FILE_KEY);
        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + FILE_KEY + "' not found in the classpath");
        }
        return properties;
    }
}
