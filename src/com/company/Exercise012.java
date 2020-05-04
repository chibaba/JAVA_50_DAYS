package com.company;

import java.util.ArrayList;
import java.util.List;

public class Exercise012 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(23);
        list.add(45);
        list.add(65);
        list.add(32);
        list.add(23);
        list.add(43);
        System.out.println(list);
        int index = list.indexOf(45);
        System.out.println("Find 45 at: " + index);
        System.out.println("Component: " + list.get(index));
    }
}
