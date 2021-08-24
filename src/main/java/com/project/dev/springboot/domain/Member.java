package com.project.dev.springboot.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Member {

    private String userId = "leejunsu";
    private String password = "password11";
    private int coin = 777;

    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDate dateOfBirth;

//    @Builder
//    public Member(String userId, String password){
//        super();
//        this.userId = userId;
//        this.password = password;
//    }

}
