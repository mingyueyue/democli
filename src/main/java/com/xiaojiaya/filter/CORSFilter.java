package com.xiaojiaya.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by moon on 2017/7/6.
 * 为解决前后端分离下，跨域问题
 */
public class CORSFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "1209600");
        response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization,accessToken");

        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {

    }
}
