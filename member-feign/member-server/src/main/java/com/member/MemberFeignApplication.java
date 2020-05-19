package com.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@SpringBootApplication
@EnableFeignClients
public class MemberFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberFeignApplication.class, args);
    }

}
