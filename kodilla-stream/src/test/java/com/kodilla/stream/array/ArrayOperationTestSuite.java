package com.kodilla.stream.array;

import org.junit.*;

public class ArrayOperationTestSuite {
    private static int n = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("End of tests");
    }

    @Before
    public void before() {
        n++;
        System.out.println("Executing Test nr " + n);
    }

    @After
    public void after() {
        System.out.println("Test completed");
    }

    @Test
    public void testGetAvarage() {
        //Given
        int[] numbersList5 = {2, 2, 2, 2};

        //When
        double numbersList2 = ArrayOperations.getAvarage(numbersList5);

        //Then
        Assert.assertEquals(2, numbersList2, 0.01);
    }

    @Test
    public void testGetAvarageEmptyArray() {
        //Given
        int[] numbersList5 = {};

        //When
        double numbersList2 = ArrayOperations.getAvarage(numbersList5);

        //Then
        Assert.assertEquals(0, numbersList2, 0.01);
    }
}

