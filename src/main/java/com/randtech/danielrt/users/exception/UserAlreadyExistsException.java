package com.randtech.danielrt.users.exception;

import com.randtech.danielrt.exception.ApiException;

public class UserAlreadyExistsException extends ApiException {


    public UserAlreadyExistsException(String message) {
        super(message);
    }

}
    
