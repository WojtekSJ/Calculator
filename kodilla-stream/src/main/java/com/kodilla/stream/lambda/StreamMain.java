package com.kodilla.stream.lambda;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();                                // [6]
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
        processor.execute(executeSaySomething);
        Executor codeToExecute = () -> System.out.println("This is an Lambda example.");
        processor.execute(codeToExecute);


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);           // [6]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);           // [7]
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);           // [8]
        expressionExecutor.executeExpression(10, 5, (a, b) -> (a / b) + 2);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier upiekrzacz = new PoemBeautifier();
        upiekrzacz.beautify("Moj pierwszy", (tekst) -> tekst + " -> abs");
        upiekrzacz.beautify("ZAMIana NA Male", (tekst) -> tekst + " //zmieniamy wielkosc liter// " + tekst.toLowerCase());
        upiekrzacz.beautify("Zmiana na duze", (tekst) -> tekst + " //zmieniamy wielkosc liter// " + tekst.toUpperCase());
        upiekrzacz.beautify("Dodanie liter przed i po.", (tekst) -> " A " + tekst + " Z");
        upiekrzacz.beautify("Obliczanie dlugosci", (tekst) -> tekst + " ma dlugosc " + tekst.length());
        upiekrzacz.beautify("Powtorz mnie dwa razy. ", (tekst) -> tekst.repeat(2));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}