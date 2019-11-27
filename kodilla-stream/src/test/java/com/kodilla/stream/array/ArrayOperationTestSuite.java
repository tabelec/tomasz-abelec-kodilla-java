package com.kodilla.stream.array;

import org.junit.*;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationTestSuite {
    int n = 1;

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
        System.out.println("Test nr " + n);
        n++;
    }

    @After
    public void after() {
        System.out.println("Test nr " + n);
        n++;
    }

    @Test
    public void testGetAvarage() {
        //Given
        int[] numbersList = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        int size = numbersList.length;

        //When
        int[] numbersList2 = ArrayOperations.getAvarage(numbersList);

        //Then
        OptionalDouble avaregeInList = IntStream.range(0, size)
                .map(n -> numbersList2[n])
                .average();

        Assert.assertEquals(OptionalDouble.of(2.0), avaregeInList);
    }
}

