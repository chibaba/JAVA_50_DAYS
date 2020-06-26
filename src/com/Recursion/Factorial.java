package com.Recursion;

import java.math.BigInteger;

import static java.math.BigDecimal.ONE;

public class Factorial {
    public static int factorial(int number) {
        if( number <= 1) {
            return BigInteger.ONE.intValue();
        } else {
            return number * factorial(number - 1);
        }
    }
    public static BigInteger factorial(BigInteger number) {


    }
}
