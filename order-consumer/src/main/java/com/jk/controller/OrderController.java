package com.jk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/find")
    public String find() {
        return "zuul请求成功";
    }


}
