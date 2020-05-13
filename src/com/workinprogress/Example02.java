package com.workinprogress;

public class Example02 {
    public static void main(String[] args) {
        //declare a string of a fixed length
        String text = "I <3 bananas";
        //provoke an exception
        char character = text.charAt(15); // gwt the 15th element
        // you will never see this print
        System.out.println("done");
    }
}
