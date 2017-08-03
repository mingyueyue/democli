package com.xiaojiaya.service.validate;

import com.xiaojiaya.pojo.User.UserDTO;

/**
 * Created by moon on 2017/8/2.
 */
public interface ValidateToken {
    //通过token查询用户信息，查询到，token存在
    UserDTO getTokenAndUserInfo(String token);
}
