package com.xiaojiaya.mapper;

import com.xiaojiaya.pojo.User.UserDTO;
import org.apache.ibatis.annotations.Param;

/**
 * Created by moon on 2017/8/1.
 */
public interface ValidateMapper {
    //查询token是有效,如果能查询到，则把用户信息返回
    UserDTO getTokenAndUserInfo(String token);

    //查询用户是否有当前接口权限
    String isExistThisAuth(@Param("typeId") int typeId, @Param("url") String url);
}
