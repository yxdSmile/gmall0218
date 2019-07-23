package com.yxdSmile.gmall.service;

import com.yxdSmile.gmall.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME gmall0218
 * @Description
 * @Author yxdSmile
 * @Date 2019/7/23
 * @Version 1.0
 */

public interface UserInfoService {
    List<UserInfo> findAll();
}
