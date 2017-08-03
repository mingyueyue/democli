package com.xiaojiaya.service.validate.impl;

import com.xiaojiaya.mapper.ValidateMapper;
import com.xiaojiaya.pojo.User.UserDTO;
import com.xiaojiaya.service.validate.ValidateToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/2.
 */
@Service
public class ValidateTokenImpl implements ValidateToken {

    @Autowired
    private ValidateMapper validateMapper;

    public UserDTO getTokenAndUserInfo(String token) {
        return validateMapper.getTokenAndUserInfo(token);
    }
}
