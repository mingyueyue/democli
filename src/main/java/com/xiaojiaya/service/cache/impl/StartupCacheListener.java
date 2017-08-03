package com.xiaojiaya.service.cache.impl;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * Created by moon on 2017/8/3.
 * 这个方法是从数据库把角色，权限的信息拿出来，放到缓存中
 */
@Service
public class StartupCacheListener implements ApplicationListener {

    public void onApplicationEvent(ApplicationEvent applicationEvent) {

    }
}
