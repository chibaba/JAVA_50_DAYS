package com.company;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise007 {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[] {3, 25, 78, 79 ,9, 25};
        Set mySet = new HashSet();
        Collections.addAll(mySet, myArray);
        System.out.println(mySet);
    }
}
