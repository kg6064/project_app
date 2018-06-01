package com.project.controller;

import com.project.Model.RequestEntity.CreateUserRequest;
import com.project.Model.ResponseEntity.CreateUserResponse;
import com.project.Validator.AdminServiceValidator;
import com.project.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by KUMAR on 01-06-2018.
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminServiceValidator adminServiceValidator;

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public List<String> userList(){
        return adminService.getAllUsers();
    }

    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public ResponseEntity<CreateUserResponse> createNewUser(@RequestBody CreateUserRequest userRequest){

        LOGGER.info("Inside AdminController --createNewUser --begin.");
        CreateUserResponse response = new CreateUserResponse();
        adminServiceValidator.createUserValidator(userRequest);

        LOGGER.info("Inside AdminController --createNewUser --end.");
        return new ResponseEntity<CreateUserResponse>(response, HttpStatus.OK);
    }


}
