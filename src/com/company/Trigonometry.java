package com.company;

//The goal of this exercise is to solve the hypotenuse of a right triangle,
//        given the lengths of the other two sides. Note that the formula for
//        calculating the hypotenuse of a
//        right-angled triangle is as follows: h2 = a2 + b2

//  h = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

public class Trigonometry {
   public static void main (String[]  args) {
       double a = 3;
       double b = 4;

       double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
       System.out.println(h);


   }

}
