package com.project.dev.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


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

    @GetMapping("/formHome")
    public String formHome(){
        return "formHome";
    }

    @GetMapping("/ajaxHome")
    public String ajaxHome(){
        return "ajaxHome";
    }




}
