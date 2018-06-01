package com.project.Model;

import com.project.Model.RequestEntity.CreateUserRequest;

import java.util.Date;

/**
 * Created by KUMAR on 02-06-2018.
 */
public class User extends CreateUserRequest{

    private String encryption;
    private Date registeredDate;

    public User() {
    }

    public String getEncryption() {
        return encryption;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public Date getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(Date registeredDate) {
        this.registeredDate = registeredDate;
    }
}
