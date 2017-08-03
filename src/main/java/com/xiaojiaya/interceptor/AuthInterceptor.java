package com.xiaojiaya.interceptor;

import com.alibaba.fastjson.JSON;
import com.xiaojiaya.pojo.User.UserDTO;
import com.xiaojiaya.service.validate.ValidateAuth;
import com.xiaojiaya.service.validate.ValidateToken;
import com.xiaojiaya.utils.Code;
import com.xiaojiaya.utils.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by moon on 2017/8/3.
 */
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    private ValidateToken validateToken;

    @Autowired
    private ValidateAuth validateAuth;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        PrintWriter out = null;
        try {
            //权限验证，根据用户名称，查询当前角色的权限否具有权限
            UserDTO userDTO = validateToken.getTokenAndUserInfo(request.getHeader("accessToken"));
            String url = request.getRequestURI();
            if (!validateAuth.isExistAuth(userDTO.getRoleId(), url)) {
                out = response.getWriter();
                out.append(JSON.toJSONString(new ResultDTO(Code.ERROR_AUTH, "error_auth")));
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

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
