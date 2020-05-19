package com.member.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@FeignClient(value = "member-feign")
public interface MemberFeignService {

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    String hello() ;
}
