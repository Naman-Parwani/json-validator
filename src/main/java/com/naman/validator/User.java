package com.naman.validator;

public class User {

    private int id;
    private String email;
    private int age;
//For jackson-:
    public User() {}

    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
}
