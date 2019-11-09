package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int myList : numbers) {
            if(myList % 2 ==0) {
                evenList.add(myList);
            }
        }
        return evenList;
    }
}
