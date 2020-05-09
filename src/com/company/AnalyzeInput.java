package com.company;

import java.io.Console;
import java.util.*;

public class AnalyzeInput {
    public static void main(String[] args) {
        ArrayList <String> text = new ArrayList<String>();
        Console cons;
        String line = "";
        while (!line.equals("*")
        && (cons = System.console()) != null
        && (line = cons.readLine()) !=null) {
            List<String> lineList = new ArrayList<String> (Arrays.asList(line.split("")));
            text.addAll(lineList);
        }
        System.out.println("You typed: "+ text);
        System.out.println("Word Count: "+ text.size());
        Set <String> textSet = new HashSet<String>();
        textSet.addAll(text);
        Iterator iterator = textSet.iterator();
        while (iterator.hasNext()) {
            //point to next element
            String s    = (String) iterator.next();
            //get the amount of time this word shows up in the text
            int freq = Collections.frequency(text, s);
            //print out the result
            System.out.println(s + " appears " + freq + " times");
        }
    }
}
