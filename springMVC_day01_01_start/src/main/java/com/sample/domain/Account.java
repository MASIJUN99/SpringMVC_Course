package com.sample.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;
    private User user;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public User getUser() {
        return user;
    }

    public Double getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }
}
