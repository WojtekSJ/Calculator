package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        if (calc.add(2, 5) == 7) {
            System.out.println("test add OK");
        } else {
            System.out.println("Error!");
        }

        if (calc.subtract(5, 2) == 3) {
            System.out.println("test substract OK");
        } else {
            System.out.println("Error!");
        }
    }
}