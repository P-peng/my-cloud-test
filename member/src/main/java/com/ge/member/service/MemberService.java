package com.ge.member.service;

import com.ge.member.mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MemberService {
    @Value("${server.port}")
    private Integer port;

    private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

    @Resource
    TestMapper testMapper;

    @GetMapping("/getUser")
    @Transactional
    public Object getUser() {
//        while (true) {
//            try {
                testMapper.insert("123123");
//                int i = 1 / 0;
//            }catch (Exception e){
//                logger.error("error", e);
//            }

//        }
        return "hello world !!!" + port;
    }
}
