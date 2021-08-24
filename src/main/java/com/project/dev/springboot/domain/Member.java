package com.project.dev.springboot.domain;

import lombok.*;

@Getter
@Setter
@ToString
public class Member {

    private String userId = "leejunsu";
    private String password = "password11";
    private int coin = 777;

//    @Builder
//    public Member(String userId, String password){
//        super();
//        this.userId = userId;
//        this.password = password;
//    }

}
