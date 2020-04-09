package com.kodilla.good.patterns.solid;

import java.util.Objects;

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

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(email, user.email) &&
                Objects.equals(address, user.address) &&
                Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email, address, phoneNumber);
    }
}
