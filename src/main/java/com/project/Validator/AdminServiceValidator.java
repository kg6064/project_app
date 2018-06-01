package com.project.Validator;

import com.project.GameAppException.AppDataException;
import com.project.Model.RequestEntity.CreateUserRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by KUMAR on 02-06-2018.
 */
@Component
public class AdminServiceValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceValidator.class);

    public void createUserValidator(CreateUserRequest createUserRequest){
        LOGGER.info("validating create user request...");
        try {
            if(createUserRequest.getUserId().equals(null)|| createUserRequest.getUserId().isEmpty()){
                throw new AppDataException("UserId cannot be null or empty!!!");
            }

            if(createUserRequest.getEmailId().equals(null)|| createUserRequest.getEmailId().isEmpty()){
                throw new AppDataException("EmailId cannot be null or empty!!!");
            }

            if(createUserRequest.getPassword().equals(null)|| createUserRequest.getPassword().isEmpty()){
                throw new AppDataException("password cannot be null or empty!!!");
            }

        }catch (AppDataException exp){
            LOGGER.error("",exp);
        }

    }
}
