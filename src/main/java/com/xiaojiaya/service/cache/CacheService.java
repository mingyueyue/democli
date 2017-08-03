package com.xiaojiaya.service.cache;

import com.xiaojiaya.pojo.sys.LoginDTO;

/**
 * Created by moon on 2017/8/3.
 */
public interface CacheService {
    //写入用户
    LoginDTO setUser(LoginDTO loginDTO);

    //读取用户
    LoginDTO getUser(String token);

    //修改用户
    LoginDTO updateUser(LoginDTO loginDTO);

    //删除用户
    LoginDTO deleteUser(String token);
}
