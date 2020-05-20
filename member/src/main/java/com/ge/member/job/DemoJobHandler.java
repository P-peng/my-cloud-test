package com.ge.member.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Component;

/**
 * @author dengzhipeng
 * @version 1.0
 * @date 2020/5/19 0019
 */
@Component
public class DemoJobHandler extends IJobHandler {

    @XxlJob("demoJobHandler")
    @Override
    public ReturnT<String> execute(String param) {
        XxlJobLogger.log("XXL-JOB, Hello World.");
        return SUCCESS;
    }

}
