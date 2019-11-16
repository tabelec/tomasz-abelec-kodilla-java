package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.expressionExecutor(10, 5, (a, b) -> a + b);
        expressionExecutor.expressionExecutor(10, 5, (a, b) -> a - b);
        expressionExecutor.expressionExecutor(10, 5, (a, b) -> a * b);
        expressionExecutor.expressionExecutor(10, 5, (a, b) -> a / b);

        expressionExecutor.expressionExecutor(10, 5, FunctionalCalculator::addAToB);
        expressionExecutor.expressionExecutor(10, 5, FunctionalCalculator::subBFromA);
        expressionExecutor.expressionExecutor(10, 5, FunctionalCalculator::multiplyAByB);
        expressionExecutor.expressionExecutor(10, 5, FunctionalCalculator::divideAByB);

        StringBuilder addString = new StringBuilder();
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> someTextInfers.toUpperCase());
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> someTextInfers.toLowerCase());
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> String.valueOf(someTextInfers.length()));
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> someTextInfers + " a kot ma Ale");
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> "ABC " + someTextInfers );
        poemBeautifier.beautify("Ala ma Kota", (someTextInfers) -> String.valueOf(addString.append("XyZ ").append(someTextInfers)));
    }
}