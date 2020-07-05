package com.alibaba.nacos.test.register;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;

/**
 * @author dalizu on 2020/5/30.
 * @version v1.0
 * @desc
 */
public class Pub {


    public static void main(String[] args) throws NacosException, InterruptedException {


        String serviceName="helloNacos";

        //nacos的地址
        NamingService namingService= NacosFactory.createNamingService("localhost:8848");
        //发布服务到nacos  假设服务端口是8091
        namingService.registerInstance(serviceName,"ddddddddd","localhost",8092);

        Thread.sleep(Integer.MAX_VALUE);

    }


}
