package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int postCount;
    private final String userName, userID;
    private final char gender;
    private final LocalDate birthDate;

    public ForumUser(String userID, int postCount, String userName, char gender, LocalDate birthDate) {
        this.userID = userID;
        this.postCount = postCount;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getUserID() {
        return userID;
    }

    public int getPostCount() {
        return postCount;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", postCount=" + postCount +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                '}';
    }
}