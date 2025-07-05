package com.pankaj.servlet;

public class CalculatorService {

    public int calculate(int a, int b, String operation) {
        return switch (operation) {
            case "add"      -> a + b;
            case "subtract" -> a - b;
            case "multiply" -> a * b;
            case "divide"   -> (b != 0) ? a / b : 0;
            default         -> 0;
        };
    }
}