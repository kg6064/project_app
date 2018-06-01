package com.project.controller;

import com.project.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by KUMAR on 01-06-2018.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/allUser")
    public List<String> userList(){
        return adminService.getAllUsers();
    }
}
