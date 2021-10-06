package com.randtech.danielrt.users.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import com.randtech.danielrt.exception.ApiException;
import com.randtech.danielrt.users.dto.CreateUserDto;
import com.randtech.danielrt.users.dto.UserDetailsDto;
import com.randtech.danielrt.users.services.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDetailsDto> createUser(@Valid @RequestBody CreateUserDto createUserDto) {

        UserDetailsDto userDetails;

        try {
            userDetails = userService.createUser(createUserDto);
        } catch (Exception e) {
            throw new ApiException(e.getMessage());
        }
        return new ResponseEntity<>(userDetails, HttpStatus.CREATED);
    }

}
