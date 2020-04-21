package com.company;

//If a person is 30 years old,
//        a normal heart rate should be between 95 beats per minute (bpm) and 162 bpm.
//        If the person is 60 years old, a normal heart rate should be between 80 and 136 bpm.

public class Exercise5 {
    public static void main(String[] args) {
        int age = 30;
        int bpm= 150;

        if (age == 30 ) {
            if ((bpm >= 95 ) && (bpm <= 162)) {
                System.out.println("Heart rate is normal");
            } else if (bpm < 95 ) {
                System.out.println("Heart rate is very low.");
            } else {
                System.out.println("Heart rate is very High");
            }
        } else if ( age == 60) {
            if (( bpm >= 80 ) && (bpm <= 136)) {
                System.out.println("Heart rate is normal.");
            } else  if (bpm < 80) {
                System.out.println("Heart rate is very low.");
            } else {
                System.out.println("Heart rate is very high");
            }
        }
    }

}
