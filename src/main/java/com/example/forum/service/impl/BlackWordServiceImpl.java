package com.example.forum.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.forum.entity.BlackWord;
import com.example.forum.mapper.BlackWordMapper;
import com.example.forum.service.BlackWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlackWordServiceImpl implements BlackWordService {

    @Autowired
    private BlackWordMapper blackWordMapper;

    @Override
    public BaseMapper<BlackWord> getRepository() {
        return blackWordMapper;
    }

    @Override
    public QueryWrapper<BlackWord> getQueryWrapper(BlackWord blackWord) {
        //对指定字段查询
        QueryWrapper<BlackWord> queryWrapper = new QueryWrapper<>();
        if (blackWord != null) {
            if (StrUtil.isNotBlank(blackWord.getContent())) {
                queryWrapper.eq("content", blackWord.getContent());
            }
        }
        return queryWrapper;
    }
}
