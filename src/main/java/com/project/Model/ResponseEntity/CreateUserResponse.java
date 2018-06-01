package com.project.Model.ResponseEntity;

import java.util.Map;

/**
 * Created by KUMAR on 02-06-2018.
 */
public class CreateUserResponse {

    private Map<String, Object> response;

    public CreateUserResponse() {
    }

    public Map<String, Object> getResponse() {
        return response;
    }

    public void setResponse(Map<String, Object> response) {
        this.response = response;
    }
}
