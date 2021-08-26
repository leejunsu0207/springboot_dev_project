package com.project.dev.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class MultiFileMember {

    private String userId;
    private String password;

    // MultipartFile 리스트 타입의 필드 선언
    private List<MultipartFile> pictureList;
}
