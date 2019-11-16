package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class CalculateAdvStatistics {
    Statistics statistics;
    private int numberofUsers = statistics.usersNames().size();
    private int postCount = statistics.postsCount();
    private int commentsCount = statistics.commentsCount();
    //double avarageNumberOfPostPerUser = postCount / numberofUsers;
    //double avarageNumberOfCommentsPerUser = commentsCount / numberofUsers;
    //double avarageNumberOfCommentPerPost = commentsCount / postCount;

    public CalculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;

    }

    public int getNumberOfUsers() {
        return numberofUsers;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    /*public double getAvarageNumberOfPostPerUser() {
        return avarageNumberOfPostPerUser;
    }

    public double getAvarageNumberOfCommentsPerUser() {
        return avarageNumberOfCommentsPerUser;
    }

    public double getAvarageNumberOfCpmmentPerPost() {
        return avarageNumberOfCommentPerPost;
    }

    public void showStatistics() {
        System.out.println("numberofUsers: " + numberofUsers);
        System.out.println("postCount: " + postCount);
        System.out.println("commentsCount: " + commentsCount);
        System.out.println("avarageNumberOfPostPerUser: " + avarageNumberOfPostPerUser);
        System.out.println("avarageNumberOfCommentsPerUser: " + avarageNumberOfCommentsPerUser);
        System.out.println("avarageNumberOfCpmmentPerPost: " + avarageNumberOfCommentPerPost);
    }*/
}