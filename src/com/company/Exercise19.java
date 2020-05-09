package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exercise19 {
    public static void main(String[] args) {
        List<Double> array = new ArrayList();
        array.add(5.0);
        array.add(2.3);
        array.add(62.9);
        array.add(2.2);
        array.add(1.4);
        System.out.println("Original list: " + array);
        Collections.sort(array);
        System.out.println("Modified list: " + array);
    }
}
