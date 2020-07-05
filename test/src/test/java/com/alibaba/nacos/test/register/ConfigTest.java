package com.alibaba.nacos.test.register;

import com.alibaba.nacos.client.utils.ParamUtil;

/**
 * @author dalizu on 2020/7/5.
 * @version v1.0
 * @desc
 */
public class ConfigTest {

    public static void main(String[] args) {

        int longingTaskCount = (int) Math.ceil(3001 / ParamUtil.getPerTaskConfigSize());

        System.out.println(longingTaskCount);
    }

}
