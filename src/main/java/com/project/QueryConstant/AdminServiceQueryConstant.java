package com.project.QueryConstant;

/**
 * Created by KUMAR on 02-06-2018.
 */
public class AdminServiceQueryConstant {

    public static final String GET_ALL_USERS = "SELECT * FROM USER";
    public static final String SAVE_USER = "INSERT INTO USER (USER_ID, EMAIL_ID, PASSWORD, ENCRYPTION) VALUES (?,?,?,?)";
    public static final String REMOVE_USER = "DELETE FROM USER WHERE USER_ID = ?";
}
