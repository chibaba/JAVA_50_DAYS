package com.socketFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Example10 {
    public static void PrintOutProperties(FileInputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(fileStream);
        System.out.println("name: "+ properties.getProperty("name"));
        System.out.println("family name: " + properties.getProperty("familyName"))
    }
}
