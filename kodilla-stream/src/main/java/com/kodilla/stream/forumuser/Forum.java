package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser("1",1032,"Marek",'M', LocalDate.of(2003, 11, 11)));
        forumUsersList.add(new ForumUser("2",0,"Darek", 'M', LocalDate.of(1982, 9, 24)));
        forumUsersList.add(new ForumUser("3",0,"Franek", 'M', LocalDate.of(1258, 5, 7)));
        forumUsersList.add(new ForumUser("4",30,"Dorota", 'F', LocalDate.of(2005, 4, 5)));
        forumUsersList.add(new ForumUser("5",10321,"Ania", 'F', LocalDate.of(1990, 3, 10)));
        forumUsersList.add(new ForumUser("6",120,"Pawel", 'M', LocalDate.of(1979, 8, 24)));
        forumUsersList.add(new ForumUser("7",58,"John",'M', LocalDate.of(1998, 11, 11)));

    }
    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forum forum = (Forum) o;

        return forumUsersList != null ? forumUsersList.equals(forum.forumUsersList) : forum.forumUsersList == null;
    }

    @Override
    public int hashCode() {
        return forumUsersList != null ? forumUsersList.hashCode() : 0;
    }
}

