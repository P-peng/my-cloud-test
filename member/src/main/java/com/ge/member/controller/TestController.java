package com.ge.member.controller;

import com.ge.member.mapper.TestMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@Controller
public class TestController {
    @Resource
    TestMapper testMapper;

    @GetMapping("/t1")
    @ResponseBody
    public Object t1(){
        testMapper.select();
        return "ok";
    }

    @GetMapping("/hello")
    @ResponseBody
    public Object hello(){
        return "hello";
    }
}
