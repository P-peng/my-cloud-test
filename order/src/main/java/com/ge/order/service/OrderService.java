package com.ge.order.service;

import com.ge.order.loadbalancer.LoadBalancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderService {

    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    LoadBalancer loadBalancer;

    @GetMapping("/orderToMember")
    public Object orderToMember(){
        // 根据服务名称 从注册中心获取集群列表
        List<ServiceInstance> instances = discoveryClient.getInstances("member");
//        ServiceInstance serviceInstance = instances.get(0);
        ServiceInstance serviceInstance = loadBalancer.getSingleAddress(instances);
        String result = restTemplate.getForObject(serviceInstance.getUri() + "/getUser", String.class);
        return "订单调用会员" + result;
    }
}
