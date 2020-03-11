package com.kodilla.good.patterns.solid;

public class User {

    private String login;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String login, String email, String address, String phoneNumber) {
        this.login = login;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
}
