package com.springsecurity.edu.SpringSecurity.controller;

import com.springsecurity.edu.SpringSecurity.dto.JoinDto;
import com.springsecurity.edu.SpringSecurity.service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JoinController {

    @Autowired
    private JoinService joinService;

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/joinProc")
    public String joinProcess(JoinDto joinDto) {

        System.out.println(joinDto.getUsername());

        joinService.joinProcess(joinDto);

        return "redirect:/login";
    }
}
