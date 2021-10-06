package com.randtech.danielrt.users.exception;

import com.randtech.danielrt.exception.ApiException;

public class UserNotFoundException extends ApiException {

    public UserNotFoundException(String message) {
        super(message);
    }

}
