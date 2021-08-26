package com.project.dev.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class FileMember {

    private String userId;
    private String password;

    // MultipartFile  타입의 필드를 선언
    private MultipartFile picture;

}
