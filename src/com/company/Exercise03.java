package com.company;

public class Exercise03 {
    public static void main(String[] args) {
        int speed = 75;
        int speedForFine = 70;
        int maxSpeed = 65;

        if (speed  > maxSpeed) {
            System.out.println("Ypur speed is way ahead of the maximum speed");
            if(speed > speedForFine) {
                System.out.println("you are eligible for a fine");

            }
        }
    }
}
