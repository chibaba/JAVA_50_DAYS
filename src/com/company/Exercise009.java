package com.company;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Exercise009 {
    public static void main(String[] args) {
        Integer[] numbers1 = new Integer[] {6, 8, 10, 12, 74};
        Integer[] numbers2 = new Integer[] {8, 23, 87, 1, 3,};

        Set set1 = new TreeSet();
        Collections.addAll(set1, numbers1);
        Set set2 = new TreeSet();
        Collections.addAll(set2, numbers2);
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
