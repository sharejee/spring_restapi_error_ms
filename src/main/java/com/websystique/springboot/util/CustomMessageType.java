package com.websystique.springboot.util;


import com.websystique.springboot.model.User;

import java.util.List;

public class CustomMessageType {

    private String message;
    private String code;
    private List<User> users;
    private User user;


    public CustomMessageType(String message, String code, List<User> users){
        this.message = message;
        this.code = code;
        this.users = users;
    }

    public CustomMessageType(String message, String code, User user){
        this.message = message;
        this.code = code;
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
