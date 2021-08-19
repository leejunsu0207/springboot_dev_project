package com.project.dev.springboot.controller;

import com.project.dev.springboot.domain.Board;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;


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

    @PostMapping("/{boardNo}")
    public ResponseEntity<String> modify(@PathVariable("boardNo") int boardNo, @RequestBody Board board){

        log.info("modify");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        return entity;
    }

    @PutMapping(value = "/{boardNo}", consumes = "application/json")
    public ResponseEntity<String> modifyByJson(@PathVariable("boardNo") int boardNo, @RequestBody Board board){

        log.info("modifyByJson");

        ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        return entity;
    }

    @PutMapping(value = "/{boardNo}", consumes = "application/xml")
    public ResponseEntity<String> modifyByXml(@PathVariable("boardNo") int boardNo, @RequestBody Board board){

        log.info("modifyByXml boardNo : "+boardNo);

        log.info("modifyByXml board :"+board);

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

    @GetMapping(value = "/{boardNo}", produces = "application/xml")
    public ResponseEntity<Board> readToXml(@PathVariable("boardNo") int boardNo){
        log.info("readToXml");

        Board board = new Board();
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("lee");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @GetMapping(value = "/{boardNo}", produces = "application/json")
    public ResponseEntity<Board> readToJson(@PathVariable("boardNo") int boardNo){
        log.info("readToJson");

        Board board = new Board();
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("lee");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @GetMapping("/{boardNo}")
    public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo){
        log.info("read");

        Board board = new Board();
        board.setTitle("제목");
        board.setContent("내용입니다.");
        board.setWriter("lee");
        board.setRegDate(LocalDateTime.now());

        ResponseEntity<Board> entity = new ResponseEntity<>(board, HttpStatus.OK);

        return entity;
    }

    @GetMapping("/read2/{no}")
    public String read2(@PathVariable("no") int boardNo){
        log.info("read2 boardNo : " + boardNo);
        return "board/read";
    }

}
