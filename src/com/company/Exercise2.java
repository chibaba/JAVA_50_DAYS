package com.company;

public class Exercise2 {
    public static void main(String[]  args) {
        int maxDistance = 20;
        int distanceToHome = 11;

        if (distanceToHome > maxDistance) {
            System.out.println("Distance from the store to your home is");
            System.out.println(" more than " + maxDistance + " km away ");
            System.out.println("this is too far for free delivery");
        }
        if (distanceToHome < maxDistance) {
            System.out.println("Distance from the store to your home is");
            System.out.println(" less than" + maxDistance + "km away");
            System.out.println("this is good enough for free delivery");
        }
    }
}
