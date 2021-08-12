package com.project.dev.springboot.domain.result;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"userNo", "itemId"})
public class UserItem {

    private int userNo;
    private int itemId;

    private String itemName;
    private String price;
    private String description;

}
