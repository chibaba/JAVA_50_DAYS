package com.workinprogress;

public class Example06 {
    private static void staticMethod() {
        System.out.println("static method, accessible from null reference");
    }
    private void nonStaticMethod() {
        System.out.println("non-static method, inaccessible from null reference ");
    }
    public static void main (String args[]) {
        Example06 object = null;
       // object.nonStaticMethod();
        object.staticMethod();

    }
}
