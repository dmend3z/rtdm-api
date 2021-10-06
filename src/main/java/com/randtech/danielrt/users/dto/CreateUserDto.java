package com.randtech.danielrt.users.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserDto {
    
    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email is not valid")
    private String email;
    
    @NotBlank(message = "Password is Required")
    private String password;

    @NotBlank(message = "Phone is Required")
    private String phone;
}
