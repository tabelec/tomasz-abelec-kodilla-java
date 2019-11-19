package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class CalculateAdvStatistics {
    Statistics statistics;
    private int numberOfUsers;
    private int postCount;
    private int commentsCount;
    double avarageNumberOfPostPerUser;
    double avarageNumberOfCommentsPerUser;
    double avarageNumberOfCommentPerPost;

    public CalculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
        this.numberOfUsers = statistics.usersNames().size();
        this.postCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        avarageNumberOfPostPerUser = (numberOfUsers == 0) ? 0 : (double) postCount / numberOfUsers;
        avarageNumberOfCommentsPerUser = (numberOfUsers == 0)  ? 0 : (double) commentsCount / numberOfUsers;
        avarageNumberOfCommentPerPost = (postCount == 0) ? 0 : (double) commentsCount / postCount;
    }

    public double getAvarageNumberOfPostPerUser() {
        return avarageNumberOfPostPerUser;
    }

    public double getAvarageNumberOfCommentsPerUser() {
        return avarageNumberOfCommentsPerUser;
    }

    public double getAvarageNumberOfCommentPerPost() {
        return avarageNumberOfCommentPerPost;
    }

    public int getNumberOfUsers() {
        return statistics.usersNames().size();
    }

    public void showStatistics() {
        System.out.println("numberofUsers: " + numberOfUsers);
        System.out.println("postCount: " + postCount);
        System.out.println("commentsCount: " + commentsCount);
        System.out.println("avarageNumberOfPostPerUser: " + avarageNumberOfPostPerUser);
        System.out.println("avarageNumberOfCommentsPerUser: " + avarageNumberOfCommentsPerUser);
        System.out.println("avarageNumberOfCpmmentPerPost: " + avarageNumberOfCommentPerPost);
    }}