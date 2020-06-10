package com.socketFiles;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example6 {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp";
        Path pathDirectory = Paths.get(pathString);
        if(Files.exists(pathDirectory)) {
            System.out.println("WARNING: directory exists already at: " + pathString);
        } else {
            try {

            }
        }
    }
}
