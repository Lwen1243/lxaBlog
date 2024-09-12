package com.example.forum.dto;

import lombok.Data;


@Data
public class PostQueryCondition {

    private Long userId;

    private Long tagId;

    private Long cateId;

    private String keywords;

}
