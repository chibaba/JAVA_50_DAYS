package com.company;

// how to display union of two sets

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Exercise008 {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[] {3,25, 78, 2, 8, 2};
        Integer[] numbers2 = new Integer[] {5, 7, 1, 87, 8};
        Set set1 = new HashSet();
        Collections.addAll(set1, numbers1);
        Set set2 = new HashSet();
        Collections.addAll(set2, numbers2);
        set1.addAll(set2);
        System.out.println(set1);

    }
}
