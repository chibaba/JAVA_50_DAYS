package com.company;

public class WordTool {
    WordTool() {}
    public int wordCount (String s,  boolean withSpace) {
        int count = 0;
        if(!(s == null || s.isEmpty())) {
            if (withSpace) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }

        }
        return count
    }
    public static void main (String[] args) {
        WordTool wt = new WordTool();
        String text = "the river carried the memories from her childhood";

        System.out.println( "Analyzing the text: \n" + text );
        System.out.println( "Total words: " + wt.wordCount(text) );
        System.out.println( "Total symbols (w. spaces): " + wt.symbolCount(text, true) );
        System.out.println( "Total symbols (wo. spaces): " + wt.symbolCount(text, false) );



    }
}
