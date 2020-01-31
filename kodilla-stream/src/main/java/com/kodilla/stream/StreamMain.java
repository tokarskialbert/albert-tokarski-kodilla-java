package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map theResultMapOfForumUsers = forum.getForumUserList().stream()
                .filter(forumUser -> forumUser.getNumberOfUserPosts() > 0)
                .filter(forumUser -> Character.toString(forumUser.getSex()).equals("M"))
                .filter(forumUser -> Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() > 19)
                .collect(Collectors.toMap(forumUser -> forumUser.getUserID(), forumUser -> forumUser));
    }
}
