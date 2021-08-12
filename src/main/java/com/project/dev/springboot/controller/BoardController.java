package com.project.dev.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @GetMapping(params = "/register", value="/get")
    public String registerForm(){
        log.info("registerForm");
        return "board/register";
    }

    @PostMapping("/register")
    public String register(){
        log.info("register");
        return "success";
    }

    @GetMapping("/modify")
    public String modifyForm(){
        log.info("modifyForm");
        return "success";
    }

    @PostMapping("/modify")
    public String modify(){
        log.info("modify");
        return "success";
    }

    @PostMapping("/remove")
    public String remove(){
        log.info("remove");
        return "success";
    }

    @GetMapping("/list")
    public String list(){
        log.info("list");
        return "success";
    }

    @GetMapping("/read/{boardNo}")
    public String read(@PathVariable("boardNo") int boardNo){
        log.info("read boardNo : " + boardNo);

        return "board/read";
    }

    @GetMapping("/read2/{no}")
    public String read2(@PathVariable("no") int boardNo){
        log.info("read2 boardNo : " + boardNo);
        return "board/read";
    }

}
