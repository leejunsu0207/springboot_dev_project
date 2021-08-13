package com.project.dev.springboot.controller;

import com.project.dev.springboot.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping(value = "/post", params = "register")
    public String register(){
        log.info("register");
        return "board/list";
    }

    @GetMapping(value = "/get",params = "modify")
    public String modifyForm(){
        log.info("modifyForm");
        return "board/modify";
    }

    @PutMapping("/{boardNo}")
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board){

        log.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        return entity;
    }

    @PutMapping(value = "/{boardNo}", headers = "X-HTTP-Method-Override=PUT")
    public ResponseEntity<String> modifyByHeader(@PathVariable("boardNo") int boardNo, @RequestBody Board board){

        log.info("modifyByHeader");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        return entity;
    }

    @PostMapping(value = "/get",params = "remove")
    public String removeForm(){
        log.info("removeForm");
        return "board/remove";
    }

    @PostMapping(value = "/post",params = "remove")
    public String remove(){
        log.info("remove");
        return "board/list";
    }

    @GetMapping(value = "/get",params = "list")
    public String list(){
        log.info("list");
        return "board/list";
    }

    @GetMapping(value = "/get", params = "read")
    public String read(){
        log.info("read");

        return "board/read";
    }

    @GetMapping("/read2/{no}")
    public String read2(@PathVariable("no") int boardNo){
        log.info("read2 boardNo : " + boardNo);
        return "board/read";
    }

}
