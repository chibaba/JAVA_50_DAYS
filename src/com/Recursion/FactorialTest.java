package com.Recursion;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigInteger;

class FactorialTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void factorialTest() {
        int answer = Factorial.factorial(5);
        assertEquals(120,answer);
    }

    private void assertEquals(int i, int answer) {
    }
    @Test
    void FactorialWithBigInteger() {
        BigInteger ourNumber = new BigInteger("5");
        BigInteger answer = calculator.factorial(ourNumber);
        assertEquals(120, answer.intValue());
    }
    @Test
    void fibonacciTest() {
      //  BigInteger

    }
}