package com.project.dev.springboot.domain;

import lombok.*;

import java.time.LocalDateTime;

//  @ToString, @Getter, @Setter, @EqualsAndHashCode, @RequiredArgsConstructor 합쳐 놓은것 =>@Data
@ToString
@Builder
public class Board {

    private int boardNo;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;

}
