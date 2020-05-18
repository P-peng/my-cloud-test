package com.ge.order.loadbalancer;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RotationLoadBalancer implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /***
     * 从 0 开始计数
     * @param serviceInstances
     * @return
     */
    @Override
    public ServiceInstance getSingleAddress(List<ServiceInstance> serviceInstances) {
        int index = atomicInteger.incrementAndGet() % serviceInstances.size();
        return serviceInstances.get(index);
    }

}
