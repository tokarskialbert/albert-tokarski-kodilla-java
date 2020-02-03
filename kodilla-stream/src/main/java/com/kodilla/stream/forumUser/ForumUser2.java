package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser2 {

    private final int userID;
    private final String nick;
    private final char sex;
    private final LocalDate birthDate;
    private final int numberOfUserPosts;

    public ForumUser2(int userID, String nick, char sex, LocalDate birthDate, int numberOfUserPosts) {
        this.userID = userID;
        this.nick = nick;
        this.sex = sex;
        this.birthDate = birthDate;
        this.numberOfUserPosts = numberOfUserPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getNick() {
        return nick;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfUserPosts() {
        return numberOfUserPosts;
    }

    @Override
    public String toString() {
        return "ForumUser2{" +
                "userID=" + userID +
                ", nick='" + nick + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", numberOfUserPosts=" + numberOfUserPosts +
                '}';
    }
}


