package com.xiaojiaya.controller.user;

import com.xiaojiaya.service.user.UserService;
import com.xiaojiaya.utils.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by moon on 2017/8/2.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")
    @ResponseBody
    public ResultDTO getAll() {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setValues(userService.getAll());
        return resultDTO;
    }
}
