package com.jk.controller;

import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import com.jk.utils.StringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/show")
    public String show() {
        return userService.show();
    }

    @RequestMapping("/list")
    public List<UserEntity> list(String userName) {
        UserEntity user = new UserEntity();
        if(StringUtil.isNotEmpty(userName)) {
            user.setUserName(userName);
        }
        return userService.list(user);
    }

}
