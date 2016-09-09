package com.dubbo.service.impl;

import com.dubbo.service.DubboService;

/**
 * Created by JIANYJ on 16/9/8.
 */
public class DubboServiceImpl implements DubboService {
    public Object save(String name) {
        System.out.println("请求:" + name);
        return "success:" + name;
    }
}
