package com.regularExpression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise3 {
    public static void main(String[] args) {
        String filePath  = System.getProperty("user.dir") + File.separator + "res" + File.separator + "packt.txt";
        try  {
            String packtDump = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
