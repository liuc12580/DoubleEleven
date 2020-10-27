package com.jk.controller;

import com.jk.config.RedisConstant;
import com.jk.service.OrderService;
import com.jk.utils.RedisUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RefreshScope
@RestController
public class OrderController {

    @Resource
    private RedisUtil redisUtil;

    // 读取配置文件的信息
    @Value("${user.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @Resource
    private OrderService orderService;

    @RequestMapping("/getUserName")
    public String getUserName() {
        System.out.println(name + "--" + port);
//        Object userName = redisUtil.get(RedisConstant.GET_USER_NAME);
        return name + "--" + port;
    }

    @RequestMapping("/select")
    @HystrixCommand(fallbackMethod = "selectFail")
    public String select() {
        orderService.select();
        return "查询订单成功。。。";
    }

    public String selectFail() {
        return "查询订单失败！！！";
    }
}
