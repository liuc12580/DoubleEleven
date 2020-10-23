package com.jk.service.hystrix;

import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //将熔断器类注入到spring容器中
public class UserServiceHystrix implements UserService {

    @Override
    public String show() {
        return "网络问题，请稍后重试。";
    }

    @Override
    public List<UserEntity> list(UserEntity user) {
        return null;
    }

}
