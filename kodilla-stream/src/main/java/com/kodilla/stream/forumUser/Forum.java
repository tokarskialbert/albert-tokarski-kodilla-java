package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser2> forumUserList = new ArrayList<ForumUser2>();

    public Forum() {
        forumUserList.add(new ForumUser2(1, "nick1", 'M', LocalDate.of(1994,10,29), 10));
        forumUserList.add(new ForumUser2(2, "nick2", 'F', LocalDate.of(1995,12,21), 101));
        forumUserList.add(new ForumUser2(3, "nick3", 'M', LocalDate.of(2000,10,29), 120));
        forumUserList.add(new ForumUser2(4, "nick4", 'F', LocalDate.of(1993,1,1), 130));
        forumUserList.add(new ForumUser2(5, "nick5", 'F', LocalDate.of(1984,5,29), 140));
        forumUserList.add(new ForumUser2(6, "nick6", 'M', LocalDate.of(1993,12,21), 150));
        forumUserList.add(new ForumUser2(7, "nick7", 'M', LocalDate.of(2005,11,19), 11));
        forumUserList.add(new ForumUser2(8, "nick8", 'M', LocalDate.of(2006,8,29), 1210));
        forumUserList.add(new ForumUser2(9, "nick9", 'F', LocalDate.of(2003,3,29), 108));
    }

    public List<ForumUser2> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
