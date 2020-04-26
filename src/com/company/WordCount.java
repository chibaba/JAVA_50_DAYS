package com.company;

public class WordCount {
    public WordCount() {}
    public int countWords (String s) {
        int count = 0;
        if(!(s == null || s.isEmpty())) {
        String w[] = s.split(  "\\s+");
        count = w.length;

        }
        return count;
    }
    public int countSymbol(String s, boolean countSpaces) {
        int count = 0;

        if (!(s== null || s.isEmpty())) {
            if(countSpaces) {
                count = s.length();
            } else {
                count = s.replace(" ", "").length();
            }
        }
        return count;
    }
    public static void main (String[] args) {
        WordCount test = new WordCount();
        String text = " some shitty test up";

        int countWords = test.countWords(text);
        int countSymbols =   test.countSymbol(text, true);
        int countSymbolNoSpace = test.countSymbol(text, false);


        System.out.println(countWords);
        System.out.println( countSymbols );
        System.out.println(countSymbolNoSpace);



    }
}
