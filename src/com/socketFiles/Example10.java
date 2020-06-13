package com.socketFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Example10 {
    public static void PrintOutProperties(FileInputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(fileStream);
        System.out.println("name: "+ properties.getProperty("name"));
        System.out.println("family name: " + properties.getProperty("familyName"));
        System.out.println("nick: "+ properties.getProperty("username"));
        System.out.println("age: "+ properties.getProperty("age"));
        System.out.println("background color: "+properties.getProperty("bgColor"));
    }

    public static void main(String[] args) throws IOException {
        String pathString = System.getProperty("user.home") + "/javaTemp/user.properties";
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(pathString);
            PrintOutProperties(fileStream);
        } catch
    }
}
