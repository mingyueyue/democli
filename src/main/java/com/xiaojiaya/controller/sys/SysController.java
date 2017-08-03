package com.xiaojiaya.controller.sys;

import com.xiaojiaya.service.cache.CacheService;
import com.xiaojiaya.utils.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by moon on 2017/7/30.
 * 用户登录，注册，修改个人信息，修改密码，等操作
 */
@Controller
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private CacheService cacheService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultDTO login() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(200);
        return resultDTO;
    }

}
