package com.xiaojiaya.interceptor;

import com.alibaba.fastjson.JSON;
import com.xiaojiaya.mapper.UserMapper;
import com.xiaojiaya.pojo.User.UserDTO;
import com.xiaojiaya.service.validate.ValidateAuth;
import com.xiaojiaya.service.validate.ValidateToken;
import com.xiaojiaya.utils.Code;
import com.xiaojiaya.utils.ResultDTO;
import com.xiaojiaya.utils.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by moon on 2017/7/30.
 */
public class TokenInterceptor implements HandlerInterceptor {

    @Autowired
    private ValidateToken validateToken;

    //可以用来实现：权限，日志，事务
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            //token判断，如果token存在
            String token = request.getHeader("accessToken");
            if (Text.isNullOREmpty(token)) {
                out = response.getWriter();
                out.append(JSON.toJSONString(new ResultDTO(Code.ERROR_TOKEN, "error_token")));
                return false;
            }
            //验证token的有效性,没有数据说明token未验证通过
            UserDTO userDTO = validateToken.getTokenAndUserInfo(token);
            if (userDTO == null) {
                out = response.getWriter();
                out.append(JSON.toJSONString(new ResultDTO(Code.ERROR_TOKEN, "error_token")));
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
        }

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
