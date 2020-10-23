package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "order-provider")
public interface OrderService {

    @RequestMapping("/select")
    void select();
}
