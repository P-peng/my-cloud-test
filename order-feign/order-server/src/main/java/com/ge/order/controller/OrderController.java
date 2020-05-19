package com.ge.order.controller;

import com.member.api.service.MemberFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@Controller(value = "/order")
public class OrderController {
//    @Autowired
//    private MemberFeignService memberFeignService;


    @GetMapping("/orderToMember")
    public Object orderToMember() {
//        return memberFeignService.hello();

        return "orderToMember";
    }
}
