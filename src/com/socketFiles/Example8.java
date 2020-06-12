package com.socketFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/temp.txt";
        Path pathFile = Paths.get(pathString);

        try {
            List<String> fileContent = Files.readAllLines(pathFile);
            //this will go through all the buffer containing the whole
            //file and Print it line by one to system.out

            for (String content:fileContent) {
                System.out.println(content);
            }
        } catch (IOException ioe) {
            System.out.println("WARNING: There was an issue with the file");
        }
    }
}
