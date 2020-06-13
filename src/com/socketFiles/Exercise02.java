package com.socketFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;

public class Exercise02 {
    if (Files.exists(pathFile)) {
        properties = LoadProperties(pathString);
    }
    public static Properties LoadProperties (String pathString) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(pathString);
            properties.load(fileInputStream)
        } catch (FileNotFoundException fnfe) {
            System.out.println("WARNING: could not find the properties file");
        } catch (IOException ioe) {
            System.out.println("WARNING: problem processing the properties file");
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        return  properties;
    }
}
