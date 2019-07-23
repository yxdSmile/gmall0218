package com.yxdsmile.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yxdSmile.gmall.entity.UserAddress;
import com.yxdSmile.gmall.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PROJECT_NAME gmall0218
 * @Description
 * @Author yxdSmile
 * @Date 2019/7/23
 * @Version 1.0
 */
@Controller
public class userAddressController {
    @Reference
    UserAddressService userAddressService;
    @RequestMapping("trade")
    public String trade(){
        System.out.println("aaaaaaaaaaaaaaaaaaaa");
        return "index";
    }

    @RequestMapping("getAddressById")
    @ResponseBody
    public List<UserAddress> getAddressById(String userId){
        List<UserAddress> list = userAddressService.getById(userId);
        return list;
    }

}

