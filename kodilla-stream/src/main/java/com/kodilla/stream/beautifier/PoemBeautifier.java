package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String someTextInfers, PoemDecorator poemDecorator) {
    String result = poemDecorator.decorate(someTextInfers);
        System.out.println(result);
    }
}