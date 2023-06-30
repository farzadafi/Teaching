package com.farzadafi.model;

import com.farzadafi.base.model.BaseEntity;

public class User extends BaseEntity<Integer> {
    private String firstname;
    private String lastname;
    private String username;
    private String password;

    public User(Integer integer, String firstname, String lastname, String username, String password) {
        super(integer);
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
