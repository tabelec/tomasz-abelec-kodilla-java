package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> someList = new ArrayList<>();
        //someList.add(1);
        //someList.add(3);
        //someList.add(2);

        //When
        OddNumbersExterminator myList = new OddNumbersExterminator();
        Boolean result = myList.exterminate(someList).isEmpty();
        System.out.println("Testing in case Array is Empty: " + result);
        //Then
        Assert.assertEquals(true, result);
    }

    @Test
    public void testOddNumbersExterminatorOddNumbersList(){
    //Given
    ArrayList<Integer> someList = new ArrayList<>();
    someList.add(1);
    someList.add(2);
    someList.add(3);
    ArrayList<Integer> someList2 = new ArrayList<>();
    someList2.add(2);

    //When
    OddNumbersExterminator myList = new OddNumbersExterminator();
    ArrayList<Integer> result = myList.exterminate(someList);

    System.out.println("Testing in case Array has odd numbers: " + result);
    //Then
    Assert.assertEquals(someList2, result);
    }
}