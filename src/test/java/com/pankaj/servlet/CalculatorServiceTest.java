package com.pankaj.servlet;

<<<<<<< HEAD
import org.junit.jupiter.api.Test; // ← JUnit 5

=======
import org.junit.jupiter.api.Test;
>>>>>>> 1d5a4032a8cea6a2e4bbc76dd6345a377c2b87c5
import static org.junit.jupiter.api.Assertions.*;

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