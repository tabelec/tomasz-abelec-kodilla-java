package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAdvStatisticWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateAdvStatistics advStatistics = new CalculateAdvStatistics(statisticsMock);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        //When);

        int numberofUsers = advStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(3, numberofUsers);
    }
}