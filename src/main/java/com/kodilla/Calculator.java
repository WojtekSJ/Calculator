package com.kodilla;
import java.util.*;
public class Calculator {
    public void addNumbers() {
        System.out.println("Adding numbers");
    }
    public void substractNumbers() {
        System.out.println("Substracting numbers");
    }

    public static void main(String[] args) {
    System.out.println("Hello world");
    Calculator calc = new Calculator();
    calc.addNumbers();
    calc.substractNumbers();

    }
}
