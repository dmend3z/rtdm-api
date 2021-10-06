package com.randtech.danielrt.users.services;

import com.randtech.danielrt.exception.DatabaseCommunicationException;
import com.randtech.danielrt.users.converter.UserConverter;
import com.randtech.danielrt.users.dto.CreateUserDto;
import com.randtech.danielrt.users.dto.UserDetailsDto;
import com.randtech.danielrt.users.exception.UserAlreadyExistsException;
import com.randtech.danielrt.users.modal.UserEntity;
import com.randtech.danielrt.users.modal.UserRepository;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetailsDto createUser(CreateUserDto createUserDto) throws UserAlreadyExistsException {

        UserEntity userEntity = UserConverter.fromCreateUserDtoToUserEntity(createUserDto);
        try {
            userRepository.save(userEntity);
        } catch (DataIntegrityViolationException e) {
            throw new UserAlreadyExistsException("User already exists");
        } catch (Exception e) {
            throw new DatabaseCommunicationException("Error while creating user", e);
        }
        return UserConverter.fromUserEntityToUserDetailsDto(userEntity);
    }

}
