package com.example.recyclerview;

public class User {

    private String userName;
    private String fullName;
    private String email;
    private int image;

    public User(String userName, String fullName, String email, int image) {
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.image = image;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
