package com.project.dev.springboot.domain;

import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@EqualsAndHashCode(of = "studentNo")
public class Student {
    private int studentNo;
    private String name;
}
