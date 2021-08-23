package com.project.dev.springboot.controller;

import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MemberController {

    @GetMapping("/registerForm")
    public String registerForm(){
        log.info("registerForm");

        return "registerForm";
    }

    @GetMapping("/register")
    public String registerByParameter(String userId, String password){
        log.info("registerByParameter");

        log.info("userID = "+userId);

        log.info("password = "+password);

        return "success";

    }

}
