package com.syntax.workingfiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class REadingPRopertiesFiles {
    public static void main(String[] args) throws IOException {
        //first step - locating the file that we need to read
        String path = "/Users/margaryta/Desktop/confi/Config.properties";

        //creating an object of the class fileintputstream to be able to move to the location where the file is stored
        FileInputStream fileInputStream = new FileInputStream(path);

        //special class to read properties files
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.get("password"));
        properties.put("yes","sdsd");







    }
}
