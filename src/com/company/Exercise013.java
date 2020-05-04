package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercise013 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(35);
        list.add(19);
        list.add(7);
        list.add(65);
        list.add(34);
        list.add(2);
        System.out.println(list);
        int index = list.lastIndexOf(34);
        System.out.println("Before: find 34 at: " + index);
        list.remove(index - 1);
        System.out.println(list);
        index = list.lastIndexOf(34);
        System.out.println("After: find 34 at :" + index);
    }
}
