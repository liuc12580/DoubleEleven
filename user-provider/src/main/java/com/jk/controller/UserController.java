package com.jk.controller;

import com.jk.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping("/list")
    public List<UserEntity> list(@RequestBody UserEntity paramUser){
        System.out.println(paramUser);
        UserEntity user = new UserEntity();
        user.setUserId(1);
        user.setUserName("李新");
        user.setPassword("123");
        List<UserEntity> list = new ArrayList<UserEntity>();
        list.add(user);
        return list;
    }
}
