package com.company;

public class Exercise12 {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "d", "E"};

        for (String letter : letters) {
            System.out.println(letter);
            if (letters.equals("A")) {
                continue;
            }
            System.out.println(letter);
            if (letter.equals("C")) {
                break;
            }
        }
    }
}
