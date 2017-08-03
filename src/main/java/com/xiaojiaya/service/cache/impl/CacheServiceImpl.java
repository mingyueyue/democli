package com.xiaojiaya.service.cache.impl;

import com.xiaojiaya.pojo.sys.LoginDTO;
import com.xiaojiaya.service.cache.CacheService;
import com.xiaojiaya.utils.Text;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/3.
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Cacheable(value = "userCache", key = "#loginDTO.accessToken")
    public LoginDTO setUser(LoginDTO loginDTO) {
        return loginDTO;
    }

    @Cacheable(value = "userCache", key = "#loginDTO.accessToken")
    public LoginDTO getUser(String token) {
        return null;
    }

    @CachePut(value = "userCache", key = "#loginDTO.accessToken")
    public LoginDTO updateUser(LoginDTO loginDTO) {
        return loginDTO;
    }

    @CacheEvict(value = "userCache", key = "#token")
    public LoginDTO deleteUser(String token) {
        return null;
    }
}
