package com.alibaba.nacos.test.register;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.listener.NamingEvent;

/**
 * @author dalizu on 2020/5/30.
 * @version v1.0
 * @desc
 */
public class Sub {

    public static void main(String[] args) throws NacosException, InterruptedException {

        String serviceName="helloNacos";

        NamingService namingService= NacosFactory.createNamingService("localhost:8848");

        namingService.subscribe(serviceName,event -> {
            if(event instanceof NamingEvent){
                System.out.println("订阅到了数据变化");
                System.out.println((((NamingEvent) event).getInstances()));
            }
        });

        System.out.println("订阅完成,等待服务信息变化");
        Thread.sleep(Integer.MAX_VALUE);

    }


}
