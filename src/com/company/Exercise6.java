package com.company;
// working on ternary operator
public class Exercise6 {
    public static void main(String[]  args) {
        int height = 200;
        int minHeight = 121;
        String result;

        result = (height > minHeight) ? "You are allowed on the ride " :
                "You do not meet the height requirements";
        System.out.println(result);
    }
}
