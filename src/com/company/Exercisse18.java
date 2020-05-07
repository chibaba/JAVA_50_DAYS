package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exercisse18 {
    public static void main(String[] args) {
        Map map = new HashMap ();
        map.put("name", "Kristian");
        map.put("family name", "onyeoka");
        map.put("address", "Jumping Rd");
        map.put("mobile", "2345-5432");
        map.put("pet", "cat");
        Iterator<Map.Entry> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.print("Key =" + entry.getKey());
            System.out.println(", Value = "+ entry.getValue());
        }
    }
}
