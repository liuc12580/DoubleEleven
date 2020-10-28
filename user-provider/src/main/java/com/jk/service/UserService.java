package com.jk.service;

import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface UserService {

    SysUser selectUserInfoByCode(String userCode);

    List<Tree> selectTreeList(Integer userId);

    List<String> selectPowerKeyList(Integer userId);
}
