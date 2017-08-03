package com.xiaojiaya.service.validate.impl;

import com.xiaojiaya.mapper.ValidateMapper;
import com.xiaojiaya.service.validate.ValidateAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/2.
 */
@Service
public class ValidateAuthImpl implements ValidateAuth {

    @Autowired
    private ValidateMapper validateMapper;

    public boolean isExistAuth(int typeId, String url) {
        try {
            String count = validateMapper.isExistThisAuth(typeId, url);
            if (!"0".equals(count)) {
                return true;
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

        return false;
    }
}
