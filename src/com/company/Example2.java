package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";

        ArrayList<String> text = new ArrayList<String>();

        while(!line.equals("*")) {
            line = input.nextLine();
            List<String> lineList = new ArrayList<String>(Arrays.asList(line.split(" ")));
            text.addAll(lineList);
        }
        System.out.println("You Typed: " +text);
    }
}
