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
        if(number.compareTo(BigInteger.ONE) <= BigInteger.ZERO.intValue()) {
            return BigInteger.ONE;
        } else {
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
        }


    }
    public static BigInteger fibonacci(BigInteger digit) {
        if (digit.equals(BigInteger.ZERO)|| digit.equals(BigInteger.ONE)) {

            return digit;
        } else {
            return fibonacci(digit.subtract(BigInteger.ONE))
        }
    }
}
