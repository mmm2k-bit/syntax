package com.syntax.workingfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreatingNewConfigFile {
    public static void main(String[] args) throws IOException {
        //first step - specify the location where to create a new file
        String path = "/Users/margaryta/Desktop/confi/Newconfig.properties";

        //creating an object of the class fileintputstream to be able to move to the location where the file is stored
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        //special class to read properties files
        Properties properties = new Properties();

        properties.put("yes","sdsd");
        properties.put("no","sdsdsdfsdf");
        //user store method to crea te file and add comment
        properties.store(fileOutputStream,"changemade");

    }
}
