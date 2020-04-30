package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise005 {
    public static void main(String[] args) {
        Integer [] myArray =  new Integer[] {3, 25, 79, 7, 98};
        Set mySet = new HashSet(Arrays.asList(myArray));
        System.out.println(mySet);
    }
}
