package com.company;

public class Exercise4 {
    public static void checkNumber(Number val ) {
        if(val instanceof Integer)
            System.out.println("its an integer");
        if(val instanceof Double);
            System.out.println("its a Double");
    }

    public static void main(String[] args) {
        int val1 =3;
        double val2 =   2.7;
        checkNumber(val1);
        checkNumber(val2);
    }
}
