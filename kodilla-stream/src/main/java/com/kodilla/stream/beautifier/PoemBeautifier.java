package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String tekst, PoemDecorator poemDecorator) {
       String result=poemDecorator.decorate(tekst);
       System.out.println(result);
    }
}
