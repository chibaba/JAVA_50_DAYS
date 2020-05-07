package com.company;
import java.io.Console;
public class Example1 {
    public static void main(String[] args) {
        Console cons;
        String line = "";
        if ((cons = System.console()) != null && (line = cons.readLine()) != null) {
            System.out.println("You typed: " + line);
        }
    }
}
