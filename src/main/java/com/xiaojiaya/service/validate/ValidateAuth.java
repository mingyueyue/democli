package com.xiaojiaya.service.validate;

import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/2.
 * 用户权限验证
 */

public interface ValidateAuth {
    boolean isExistAuth(int typeId, String url);
}
