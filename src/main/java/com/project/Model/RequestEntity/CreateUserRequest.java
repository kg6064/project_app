package com.project.Model.RequestEntity;

/**
 * Created by KUMAR on 02-06-2018.
 */
public class CreateUserRequest {

    private String userId;
    private String emailId;
    private String password;

    public CreateUserRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
