package com.socketFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

public class Exercise02 {
    public static void PrintOutProperties(Properties properties) {
        Enumeration keys = properties.keys();
        for (int i = 0; i < properties.size(); i++) {
            String key = keys.nextElement().toString();
            System.out.println( key + ": " +properties.getProperty(key));
        }
    }
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
            Path pathFile = Paths.get(pathString);


            // creating the property object
            Properties properties = new Properties();

            // if the property file exists, load the file into the property object
            if (Files.exists(pathFile)) {
                try {
                    properties = LoadProperties(pathString);
                } catch (IOException ioe) {
                    System.out.println("WARNING: problem closing the file to the stream");
                }
            }
            // iterating through the rest of the property object and add them to the property object
            for (int i = 1; i < args.length; i++) {
                String [] keyValue = args[i].split(" ");
                properties.setProperty(keyValue[0], keyValue[1]);
            }
            try {
                WriteProperties(pathString, properties);
            } catch (IOException ioe) {
                System.out.println("warning: problem while closing property file");
            }
            // printing out the final result of the system
            PrintOutProperties(properties);
        }


}
