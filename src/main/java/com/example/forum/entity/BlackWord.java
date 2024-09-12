package com.example.forum.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.forum.common.base.BaseEntity;
import com.example.forum.common.constant.CommonConstant;
import lombok.Data;


@Data
@TableName("black_word")
public class BlackWord  {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String content;
}
