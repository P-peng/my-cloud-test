package com.ge.member;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Logger;


@SpringBootApplication
@MapperScan("com.ge.*.mapper")
public class MemberApplication {

//    private static final Logger logger = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
        System.out.println("#############################################");
        System.out.println("##########    Member 服务器启动    ##########");
        System.out.println("#############################################");
    }

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
