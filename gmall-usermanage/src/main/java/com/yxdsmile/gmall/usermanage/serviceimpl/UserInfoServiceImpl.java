package com.yxdsmile.gmall.usermanage.serviceimpl;

import com.yxdSmile.gmall.entity.UserInfo;
import com.yxdsmile.gmall.usermanage.mapper.UserInfoMapper;
import com.yxdSmile.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PROJECT_NAME gmall0218
 * @Description
 * @Author yxdSmile
 * @Date 2019/7/23
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }
}
