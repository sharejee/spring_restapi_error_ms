package com.websystique.springboot.util;


public class CustomErrorType {

    private String errorMessage;
    private String code;


    public CustomErrorType(String errorMessage,String code){
        this.errorMessage = errorMessage;
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
