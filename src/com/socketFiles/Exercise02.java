package com.socketFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Exercise02 {
//    if (Files.exists(pathFile)) {
//        properties = LoadProperties(pathString);
//    }
    public static Properties LoadProperties (String pathString) throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(pathString);
            properties.load(fileInputStream);
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
    public static void WriteProperties(String pathString, Properties properties)
        throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(pathString);
            // write the resulting  properties object back to the file
            // add  the comment the timestamp to the latest modification mode
            properties.store(fileOutputStream, "modified on" + java.time.LocalDate.now());
        } catch (FileNotFoundException fnfe) {
            System.out.println("WARNING: could not find the properties file");
        } catch (IOException ioe) {
            System.out.println("WARNING: problem processing the properties file");
        } finally {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        }
    }
        public static  void main(String[] args) {
            // take first argument as the file to open. By default
            // I will be using the temporary folder
            String pathString  = System.getProperty("user.home") + "/javaTemp/" + args[0];

            // creating the property object
            Path pathFile = Paths.get(pathString);

            // if the property file exists, load the file into the property object
            if (Files.exists(pathFile))
        }


}
