package com.yxdsmile.gmall.usermanage.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yxdSmile.gmall.entity.UserAddress;
import com.yxdSmile.gmall.service.UserAddressService;
import com.yxdsmile.gmall.usermanage.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @PROJECT_NAME gmall0218
 * @Description
 * @Author yxdSmile
 * @Date 2019/7/23
 * @Version 1.0
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    UserAddressMapper userAddressMapper;
    /**
     * 根据用户id查找用户地址
     */
    @Override
    public List<UserAddress> getById(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> select = userAddressMapper.select(userAddress);
        return select;
    }


}
