package com.project.dev.springboot.controller;

import com.project.dev.springboot.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Locale locale, Model model){

        log.info("Welcome home! The client locale is "+locale+".");


        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
        String formattedNow = now.format(formatter);

        model.addAttribute("serverTime", formattedNow);

        return "home";

    }

    @GetMapping("/registerForm")
    public String registerForm(){
        log.info("registerForm");
        return "registerForm";
    }

    @GetMapping("/goHome0101")
    public void home0101(){
        log.info("home0101");
    }

    @GetMapping("/sub/goHome0102")
    public void home0102(){
        log.info("home0102");
    }

    @GetMapping("/goHome0201")
    public String home0201(){
        log.info("home0201");
        return "home0201";
    }

    @GetMapping("/sub/goHome0202")
    public String home0202(){
        log.info("home0202");
        return "home0202";
    }

    @GetMapping("/sub/goHome0203")
    public String home0203(){
        log.info("home0203");
        return "sub/home0203";
    }

    @GetMapping("/goHome0204")
    public String home0204(){
        log.info("home0204");
        return "redirect:/sub/goHome0205";
    }

    @GetMapping("/sub/goHome0205")
    public String home0205(){
        log.info("home0205");
        return "/sub/goHome0205";
    }

    @ResponseBody
    @GetMapping("/goHome0301")
    public Member home0301(){
        log.info("home0301");

        Member member = new Member();

        return member;
    }

    @ResponseBody
    @GetMapping("/goHome04")
    public List<Member> home04(){
        log.info("home04");
        List<Member> list = new ArrayList<>();
        Member member = new Member();
        list.add(member);
        Member member1 = new Member();
        list.add(member1);
        return list;
    }

    @ResponseBody
    @GetMapping("/goHome05")
    public Map<String, Member> home05(){
        log.info("home05");
        Map<String,Member> map = new HashMap<>();
        Member member = new Member();
        map.put("key1",member);
        Member member1 = new Member();
        map.put("key2",member1);
        return map;
    }

    @ResponseBody
    @GetMapping("/goHome06")
    public ResponseEntity<Void> home06(){
        log.info("home06");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome07")
    public ResponseEntity<String> home07(){
        log.info("home07");
        return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome08")
    public ResponseEntity<Member> home08(){
        log.info("home08");
        Member member = new Member();
        return new ResponseEntity<Member>(member,HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome09")
    public ResponseEntity<List<Member>> home09(){
        log.info("home09");
        List<Member> list = new ArrayList<>();
        Member member = new Member();
        list.add(member);
        Member member1 = new Member();
        list.add(member1);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome10")
    public ResponseEntity<Map<String, Member>> home10(){
        log.info("home10");
        Map<String,Member> map = new HashMap<>();
        Member member = new Member();
        map.put("key1",member);
        Member member1 = new Member();
        map.put("key2",member1);
        return new ResponseEntity<>(map,HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/goHome1101")
    public ResponseEntity<byte[]> home1101() throws Exception{
        log.info("home1101");
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try{
            HttpHeaders headers = new HttpHeaders();
            in = new FileInputStream("C:\\TEMP\\sample.png");
            headers.setContentType(MediaType.IMAGE_PNG);
            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        }finally {
            in.close();
        }
        return entity;


    }

    @ResponseBody
    @GetMapping("/goHome1102")
    public ResponseEntity<byte[]> home1102() throws Exception{

        log.info("home1102");

        String fileName = "test.zip";
        InputStream in = null;
        ResponseEntity<byte[]> entity = null;

        try{
            HttpHeaders headers = new HttpHeaders();
            in = new FileInputStream("C:\\TEMP\\sample.png");
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            headers.add("Content-Disposition", "attachment; filename=\""+new String(fileName.getBytes("UTF-8"),"ISO-8859-1")+"\"");

            entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in), headers, HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
            new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
        }finally {
            in.close();
        }
        return entity;


    }


    @GetMapping("/formHome")
    public String formHome(){
        return "formHome";
    }

    @GetMapping("/ajaxHome")
    public String ajaxHome(){
        return "ajaxHome";
    }




}
