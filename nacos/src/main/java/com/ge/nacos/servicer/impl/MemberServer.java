package com.ge.nacos.servicer.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberServer {

    /**
     *
     * @return
     */
    @GetMapping("/getUser")
    public Object getUser(){
        return "hello world !!!";
    }
}
