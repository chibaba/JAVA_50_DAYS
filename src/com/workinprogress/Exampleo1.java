package com.workinprogress;

public class Exampleo1 {
    public static void main(String[] args) {
        //declare a string with nothing inside
        String text = null;
        // you will see this at the console
        System.out.println("Go Java Go");
        //nulled  strings should crash your programme
        System.out.println(text.length());
        //you will never see this print
        System.out.println("done");
    }
}
