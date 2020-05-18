package com.ge.order.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 负载均衡器
 */
public interface LoadBalancer {

    /**
     * 轮询获取服务
     */
    ServiceInstance getSingleAddress(List<ServiceInstance> serviceInstances);
}
