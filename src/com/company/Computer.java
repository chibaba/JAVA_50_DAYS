package com.company;

 class Computer {
     public void whatIsIt() {
         System.out.println("its a pc");


     }

     class Tablet extends Computer {
         public void whatIsIt() {
             System.out.println("its a tablet");
         }
     }

//     public static void main(String[] args) {
//         Tablet myTab = new Tablet();
//         myTab.whatIsIt();
//     }
 }