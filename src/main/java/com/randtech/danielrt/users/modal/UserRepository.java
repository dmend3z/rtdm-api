package com.randtech.danielrt.users.modal;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UserRepository extends JpaRepository<UserEntity, Long> {


    /**
     * Get user by Email
     * @param email
     * @return User
     */
    Optional<UserEntity> findByEmail(String email);
    
}
