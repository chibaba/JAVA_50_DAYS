package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise0016 {
    public static void main (String[] args) {
        List array = new ArrayList();
        array.add(5);
        array.add(7);
        array.add(27);
        Iterator iterator = array.iterator();
        while (iterator.hasNext()) {
            //points to the next line
            int i = (Integer) iterator.next();
            //print element
            System.out.println(i + " ");
        }
    }
}
