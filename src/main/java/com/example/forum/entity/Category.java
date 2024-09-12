package com.example.forum.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.forum.common.base.BaseEntity;
import lombok.Data;


@Data
@TableName("category")
public class Category extends BaseEntity {


    private String cateName;


    private Integer cateSort;


    private String cateDesc;
}
