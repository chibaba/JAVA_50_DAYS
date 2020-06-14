package com.socketFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example12 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "javaTemp/Numbers.txt";
        Path pathFile = Paths.get(pathString);
        //if the numbers file dosen't exist, create a file with 10 random numbers
        // between 0 and 10, so that we can make something with them
        if (Files.notExists(pathFile)) {
            int [] numbers = new int [10];
            for (int i = 0; i < 10; i ++) {
                numbers[i] = (int) (Math.random() * 10);
            }
        }
    }
}
