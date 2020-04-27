package com.company;

public class WordTool {
    public WordTool() {}

    public int countWords(String s) {
        int count = 0;
        if(!(s == null || s.isEmpty())) {
            String w[] = s.split("//s+");
            count = w.length;
        }
        return count;

    }
    public int countLetters(String s, boolean countLetters) {
        int count = 0;
        if(!(s == null || s.isEmpty())) {
            if (countLetters) {
                count = s.length();
            } else {
                count = s.replace( " ", "").length();
            }
        }
        return count;

    }

    public static void main(String[] args) {
        WordTool panda = new WordTool();
        String word = "The game just began, for those not coming again";

        int countWords = panda.countWords(word);

        int countLetters = panda.countLetters(word, true);

        int countLettersNoSpace = panda.countLetters(word, false);

        System.out.println("the numbers of counted words : " + countWords );
        System.out.println("the number of counted letters with spaces is:  "+ countLetters);
        System.out.println("the number of counted letters without space is :" + countLettersNoSpace);

    }
}
