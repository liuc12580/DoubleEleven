package com.jk.service;

import com.jk.entity.UserEntity;
import com.jk.service.hystrix.UserServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "user-provider", fallback = UserServiceHystrix.class)
public interface UserService {

    @RequestMapping("/show")
    String show();

    @RequestMapping("/list")
    public List<UserEntity> list(@RequestBody UserEntity paramUser);
}
