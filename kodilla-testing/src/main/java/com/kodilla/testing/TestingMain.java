package com.kodilla.testing.collection;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args){
        ArrayList<Integer> someList = new ArrayList<>();
        someList.add(1);
        someList.add(3);
        someList.add(2);

        System.out.println(someList);
        OddNumbersExterminator myList = new OddNumbersExterminator();

        System.out.println(myList.exterminate(someList));
    }

}