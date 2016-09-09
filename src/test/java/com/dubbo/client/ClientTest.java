package com.dubbo.client;

import com.dubbo.service.DubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by JIANYJ on 16/9/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-dubbo-consumer.xml", "classpath*:spring-context.xml"})
public class ClientTest {
    @Resource
    private DubboService dubboService;

    @Test
    public void test1() {
        System.out.println(this.dubboService.save("a"));
    }
}
