package com.yxdsmile.gmall.usermanage.controller;

import com.yxdSmile.gmall.entity.UserInfo;
import com.yxdSmile.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PROJECT_NAME gmall0218
 * @Description
 * @Author yxdSmile
 * @Date 2019/7/23
 * @Version 1.0
 */
@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        List<UserInfo> all = userInfoService.findAll();
        return all;
    }
}
