package com.alibaba.nacos.test.register;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

/**
 * @author dalizu on 2020/7/5.
 * @version v1.0
 * @desc
 */
public class ConfigPub {

    public static void main(String[] args) throws NacosException {

        final String dataId="test";

        final String group="DEFAULT_GROUP";

        ConfigService configService= NacosFactory.createConfigService("localhost:8848");

        configService.publishConfig(dataId,group,"test config body");
    }
}
