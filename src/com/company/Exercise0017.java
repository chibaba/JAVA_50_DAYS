package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise0017 {
    public static void main(String[] args) {
        List<Double> array = new ArrayList();
        array.add(5.0);
        array.add(2.2);
        array.add(65.8);
        array.add(2.09);
        array.add(5.5);
        array.add(23.8);
        System.out.println("Original text: " + array);
        ListIterator listIterator = array.listIterator();
        while (listIterator.hasNext()) {
            double d = (Double) listIterator.next();
            //round up the decimal number
            listIterator.set(Math.round(d));
        }
        System.out.println("Modified list: " + array);
    }
}
