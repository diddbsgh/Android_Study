package com.example.api;

public class SignUpRequest {
    private String userName;
    private String userId;
    private String userPw;

    public SignUpRequest(String userName, String userId, String userPw) {
        this.userName = userName;
        this.userId = userId;
        this.userPw = userPw;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserPw() {
        return userPw;
    }
}
