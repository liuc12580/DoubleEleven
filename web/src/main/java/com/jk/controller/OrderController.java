package com.jk.controller;

import com.jk.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

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
