package com.springsecurity.edu.SpringSecurity.service;

import com.springsecurity.edu.SpringSecurity.dto.JoinDto;
import com.springsecurity.edu.SpringSecurity.entity.UserEntity;
import com.springsecurity.edu.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void joinProcess(JoinDto joinDto) {

        // db에 이미 동일한 username을 가진 회원이 존재하는지?

        UserEntity data = new UserEntity();

        data.setUsername(joinDto.getUsername());
        data.setPassword(bCryptPasswordEncoder.encode(joinDto.getPassword()));
        data.setRole("ROLE_USER");

        userRepository.save(data);
    }
}
