package com.project.dev.springboot.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.YearMonth;

@Getter
@Setter
@ToString
public class Card {
    private String no;

    private YearMonth validMonth;
}
