package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 10) == 15 ? "Test ok" : "Test nie ok ;)");
        System.out.println(calculator.subtract(5, 15) == -10 ? "Test ok" : "Test nie ok ;)");
    }

}