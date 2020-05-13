//package com.company;
//
//import java.io.Console;
//import java.util.*;
//
//
//    class DataPoint {
//        String key = "";
//        Integer value = 0;
//        //constructor
//        DataPoint (String s, Integer i) {
//            key = s;
//            value = i;
//        }
//    }
//    class SortByValue implements Comparator <DataPoint>
//    {
//        // Used for sorting in ascending order
//        public int compare (DataPoint a, DataPoint b) {
//            return  a.value - b.value;
//        }
//    }
//    public class AnalyzeInput2 {
//        public static void main(String[] args) {
//            ArrayList <String> text = new ArrayList<String>();
//            Console cons;
//            String line = "";
//            while (!line.equals("*")
//            && (cons = System.console()) != null
//            && (line = cons.readLine()) != null) {
//                List<String> lineList = new ArrayList <String> (Arrays.asList(line.split(" ")));
//                text.addAll(lineList);
//            }
//            System.out.println("You typed: " + text);
//            System.out.println("Word count: " + text.size());
//            textSet = new HashSet <String> ();
//            textSet.addAll(text);
//
//            Iterator iterator = textSet.iterator();
//            List <DataPoint> frequencies  =  new ArrayList <DataPoint> ();
//
//            while (iterator.hasNext()) {
//                //point to next element
//                String s = (String) iterator.next();
//                //get the amount of times this word shows up in the text
//                 int freq = Collections.frequency(text, s);
//                 //print out the result
//                System.out.println(s + "appears " + freq + " times");
//                // create object to be stored
//                DataPoint dataPoint = new DataPoint(s, freq);
//                // add datappoint to the list
//                frequencies.add(dataPoint);
//            }
//            Collections.sort(frequencies, Collections.reverseOrder(new SortByValue()));
//            System.out.println("Results sorted");
//            for (int i =0; i < frequencies.size(); i++)
//                System.out.println(frequencies.get(i).value + "times for word " +frequencies.get(i).key);
//        }
//
//    }
//
