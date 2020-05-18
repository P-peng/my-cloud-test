package com.ge.member.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    @Value("${server.port}")
    private Integer port;

    @GetMapping("/getUser")
    public Object getUser() {
        return "hello world !!!" + port;
    }
}
