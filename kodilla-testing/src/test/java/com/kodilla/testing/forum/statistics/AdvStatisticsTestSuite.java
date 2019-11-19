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
        for (int i = 0; i < 100; i++) {
            usersNames.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);

        //When);
        int numberOfUsers = advStatistics.getNumberOfUsers();

        //Then
        Assert.assertEquals(100, numberOfUsers);
    }

    @Test
    public void testAdvStatisticWithAllZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When);
        CalculateAdvStatistics advStatistics = new CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, advStatistics.avarageNumberOfCommentPerPost, 0.01);
        Assert.assertEquals(0, advStatistics.avarageNumberOfCommentsPerUser, 0.01);
        Assert.assertEquals(0, advStatistics.avarageNumberOfPostPerUser, 0.01);
    }

    @Test
    public void testAdvStatisticWithMockWithTwoUsers1000Post100comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        usersNames.add("sdas");
        usersNames.add("sdas");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When);
        CalculateAdvStatistics advStatistics = new CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.1, advStatistics.avarageNumberOfCommentPerPost, 0.01);
        Assert.assertEquals(50, advStatistics.avarageNumberOfCommentsPerUser, 0.01);
        Assert.assertEquals(500, advStatistics.avarageNumberOfPostPerUser, 0.01);
    }

    @Test
    public void testAdvStatisticWithMockCommentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When);
        CalculateAdvStatistics advStatistics = new CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.1, advStatistics.avarageNumberOfCommentPerPost, 0.01);
        Assert.assertEquals(1, advStatistics.avarageNumberOfCommentsPerUser, 0.01);
        Assert.assertEquals(10, advStatistics.avarageNumberOfPostPerUser, 0.01);
    }

    @Test
    public void testAdvStatisticWithMockCommentsMoreThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When);
        CalculateAdvStatistics advStatistics = new CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, advStatistics.avarageNumberOfCommentPerPost, 0.01);
        Assert.assertEquals(10, advStatistics.avarageNumberOfCommentsPerUser, 0.01);
        Assert.assertEquals(1, advStatistics.avarageNumberOfPostPerUser, 0.01);
    }
}
