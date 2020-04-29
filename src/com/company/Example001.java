package com.company;

import java.util.Arrays;

public class Example001 {
    public static  void main(String[] args) {
        String []  text = new String[] {"chibaba", "clean", "my", "car", "am"};
        Arrays.sort(text);
        System.out.println(Arrays.toString(text));
        for (int i = 0; i < text.length; i++) {
            System.out.println(text[i] + " ");
        }
    }
}
