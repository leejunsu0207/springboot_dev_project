package com.project.dev.springboot.domain;

import jdk.jfr.Timespan;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Address {

    private String postCode;
    private String location;

}
