package com.project.dev.springboot.domain;

import lombok.*;

@ToString
public class Member {

    private String userId;
    private String password;
    private String userName;

    @Builder
    public Member(String userId, String password){
        super();
        this.userId = userId;
        this.password = password;
    }

}
