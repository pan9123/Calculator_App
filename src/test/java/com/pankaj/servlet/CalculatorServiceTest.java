package com.pankaj.servlet;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorServiceTest {

    @Test
    public void testAddition() {
        CalculatorService calc = new CalculatorService();
        assertEquals(9, calc.calculate(4, 5, "add"));
    }

    @Test
    public void testDivideByZero() {
        CalculatorService calc = new CalculatorService();
        assertEquals(0, calc.calculate(10, 0, "divide"));
    }

    @Test
    public void testUnknownOperation() {
        CalculatorService calc = new CalculatorService();
        assertEquals(0, calc.calculate(3, 3, "modulus"));
    }
}