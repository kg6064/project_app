package com.project.service;

import com.project.DAO.AdminServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KUMAR on 01-06-2018.
 */
@Service
public class AdminService {

    @Autowired
    private AdminServiceDAO adminServiceDAO;

    public List<String> getAllUsers(){
        return adminServiceDAO
                .getUserList();
    }
}
