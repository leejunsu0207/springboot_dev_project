package com.project.dev.springboot.domain;

import lombok.*;

@Getter
@Setter
@ToString
public class Member {

    private String userId = "user11";
    private String password = "password11";

//    @Builder
//    public Member(String userId, String password){
//        super();
//        this.userId = userId;
//        this.password = password;
//    }

}
