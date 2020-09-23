package com.alibaba.nacos.test.register;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.concurrent.Executor;

/**
 * @author dalizu on 2020/7/5.
 * @version v1.0
 * @desc
 */
public class ConfigSub {

    public static void main(String[] args) throws NacosException, InterruptedException {

        final String dataId="test";

        final String group="DEFAULT_GROUP";

        ConfigService configService= NacosFactory.createConfigService("localhost:8848");

        configService.addListener(dataId, group, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }
            @Override
            public void receiveConfigInfo(String configInfo) {

                System.out.println("receiveConfigInfo:"+configInfo);
            }
        });

        Thread.sleep(Integer.MAX_VALUE);
    }
}
