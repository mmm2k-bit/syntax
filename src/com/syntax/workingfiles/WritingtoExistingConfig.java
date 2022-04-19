package com.syntax.workingfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingtoExistingConfig {
    public static void main(String[] args) throws IOException {
        String path = "Files/Config.properties";
        //in order to add to existing properties file without overriding we need to first create fileinputstream object
        FileInputStream fileInputStream = new FileInputStream(path);
        //creating an object of the class fileintputstream to be able to move to the location where the file is stored


        //special class to read properties files
        Properties properties = new Properties();
        //then we need to use load method to load existing fileinputstream object
        properties.load(fileInputStream);
        //only then we should use put method to add values to the file
        properties.put("URL", "google.com");
        //we should create fileoutputstream object right before we are reasy to use store method
        FileOutputStream fileOutputStream = new FileOutputStream(path);

        properties.store(fileOutputStream,"aded url"); //this will actually overrride the file


    }
}
