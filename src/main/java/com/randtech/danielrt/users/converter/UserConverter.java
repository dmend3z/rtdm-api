package com.randtech.danielrt.users.converter;

import com.randtech.danielrt.users.dto.CreateUserDto;
import com.randtech.danielrt.users.dto.UserDetailsDto;
import com.randtech.danielrt.users.modal.UserEntity;

public class UserConverter {

    public static UserDetailsDto fromUserEntityToUserDetailsDto(UserEntity userEntity) {
        return UserDetailsDto.builder().id(userEntity.getId()).name(userEntity.getName()).email(userEntity.getEmail())
                .phone(userEntity.getPhone()).build();
    }

    public static UserEntity fromCreateUserDtoToUserEntity(CreateUserDto createUserDto) {
        return UserEntity.builder().name(createUserDto.getName()).email(createUserDto.getEmail())
                .phone(createUserDto.getPhone()).password(createUserDto.getPassword()).build();
    }

}
