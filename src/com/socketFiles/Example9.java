package com.socketFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
        Path pathFile = Paths.get(pathString);
        try {
            Files.lines(pathFile).forEach(System.out::println);
        } catch (IOException ioe) {
            System.out.println("WARNING: there was an issue with the file");
        }

    }
}
