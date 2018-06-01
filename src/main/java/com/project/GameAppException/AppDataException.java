package com.project.GameAppException;

/**
 * Created by KUMAR on 02-06-2018.
 */
public class AppDataException extends Exception{

    private String customMessage;
    private int errorCode;

    public AppDataException() {
    }

    public AppDataException(String message) {
        this.customMessage = message;
    }

    public AppDataException(String customMessage, int errorCode){
        this.customMessage = customMessage;
        this.errorCode = errorCode;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
