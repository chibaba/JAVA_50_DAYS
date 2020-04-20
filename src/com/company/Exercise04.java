package com.company;

public class Exercise04 {
    public static void main(String[] args) {
        int noDiscount = 0;
        int mediumDiscount = 10;
        int largeDiscount = 15;
        int mediumThreshold = 5;
        int largeThreshold = 50;
        int purchaseAmount = 40;

        if (purchaseAmount >= largeThreshold) {
            System.out.println("you get a Discount " + largeDiscount + "%");
        } else if (purchaseAmount >= mediumThreshold) {
            System.out.println(" you get a discount of " + mediumDiscount + "%");
        } else {
            System.out.println("You get a discount of " + noDiscount + "%");
        }
    }
}
