package com.kodilla.stream.immutable;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class ForumUser {
    private final String username;
    private final String realName;
    private final List<ForumUser> friends;
    private final Date birthDate;

    public ForumUser(String username, String realName, List<ForumUser> friends, Date birthDate) {
        this.username = username;
        this.realName = realName;
        this.friends = new ArrayList<>(friends);
        this.birthDate = new Date(birthDate.getTime());

    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public List<ForumUser> getFriends() {
        return friends;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
