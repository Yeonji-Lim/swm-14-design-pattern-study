package org.example.entity;

public class User {

    private Long id;
    private String name;

    public static User create(String name) {
        User user = new User(name);
        return user;
    }

    protected User(String name) {
        this.name = name;
    }
}
