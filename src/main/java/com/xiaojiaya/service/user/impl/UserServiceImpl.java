package com.xiaojiaya.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaojiaya.mapper.UserMapper;
import com.xiaojiaya.pojo.User.UserDTO;
import com.xiaojiaya.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by moon on 2017/8/2.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public PageInfo getAll() {
        PageHelper.startPage(2, 10);
        List<UserDTO> list = userMapper.findUserAll();
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
