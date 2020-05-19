package com.member.server.service.imp;

import com.member.api.service.MemberFeignService;
import org.springframework.stereotype.Service;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@Service
public class MemberFeignImpl implements MemberFeignService {
    @Override
    public String hello() {
        return "MemberFeignImpl";
    }
}
