package com.randtech.danielrt.users.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDetailsDto {
    
    private Long id;
    private String name;
    private String email;
    private String phone;
}
