package com.company;

public class Exercise9 {
    public static void main(String[] args) {
        String cat = new String("cat");
        String dog = new String("dog");
        if(cat.equals(dog)) {
            System.out.println("Cats and dogs are noy the same");
        }
        if(!cat.equals(dog)) {
            System.out.println("Cats and dogs are not the same");
        }
        if (dog.equals(dog)) {
            System.out.println("Dogs are dogs");
        }
    }
}
