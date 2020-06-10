package com.socketFiles;

import javax.imageio.IIOException;
import java.io.IOException;
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
                // Create the Directory
                Files.createDirectories(pathDirectory);
                System.out.println("New directory created at: " + pathString);

            } catch (IOException ioe) {
                System.out.println("Could not created the directory");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }
        String fileName = "temp.txt";
        Path pathFile = Paths.get(pathString + fileName);
        if(Files.exists(pathFile)) {
            System.out.println("WARNING: files exists already at: " + pathFile);
        } else {
            try{
                // Create the file
                Files.createFile(pathFile);
                System.out.println("New File created at: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("Could not create the file");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }
    }
}
