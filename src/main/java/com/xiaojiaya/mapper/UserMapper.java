package com.xiaojiaya.mapper;

import com.xiaojiaya.pojo.User.UserCreateDTO;
import com.xiaojiaya.pojo.User.UserDTO;
import com.xiaojiaya.pojo.User.UserShowDTO;
import com.xiaojiaya.pojo.User.UserUpdateDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by moon on 2017/7/6.
 */
public interface UserMapper {
    //通过账号和密码登录
    UserShowDTO findUserByAccountAndPassword(@Param("account") String account, @Param("password") String password);

    //通过用户id查询用户信息
    UserDTO findUserById(String userId);

    List<UserDTO> findUserByParams(@Param("userId") String userId,
                                   @Param("roleType") String roleType,
                                   @Param("account") String account,
                                   @Param("page") int page,
                                   @Param("size") int size);

    //查询所有用户信息
    List<UserDTO> findUserAll();

    //添加用户信息
    void createUser(UserCreateDTO data);

    //修改用户信息--用户禁用
    void updateUser(UserUpdateDTO data);

    //删除用户
    void deleteUser(String userId);

    //根据账号查询用户是否存在
    String userIsExistByAccount(String userAccount);

    //根据id查询用户是否存在
    String userIsExistByUserId(String userId);


}
