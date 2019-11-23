package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.world.Country;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<String, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forum -> forum.getGender() == 'M')
                .filter(forum -> Period.between(forum.getBirthDate(), LocalDate.now()).getYears() > 20)
                .filter(forum -> forum.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}