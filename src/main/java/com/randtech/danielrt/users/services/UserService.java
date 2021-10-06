package com.randtech.danielrt.users.services;

import com.randtech.danielrt.users.dto.CreateUserDto;
import com.randtech.danielrt.users.dto.UserDetailsDto;
import com.randtech.danielrt.users.exception.UserAlreadyExistsException;

public interface UserService {


    /**
     * Create a new user
     * @param createUserDto
     * @return created user
     * @throws UserAlreadyExistsException
     */

     UserDetailsDto createUser(CreateUserDto createUserDto) throws UserAlreadyExistsException;
    
}
