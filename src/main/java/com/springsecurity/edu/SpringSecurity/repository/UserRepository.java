package com.springsecurity.edu.SpringSecurity.repository;


import com.springsecurity.edu.SpringSecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    boolean existsByUsername(String username);
}
