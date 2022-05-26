package com.itnan.handler;

import com.itnan.utils.ResultUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.handler
 * @ClassName UserAuthenticationEntryPointHandler.java
 * @createTime 2022年05月26日 13:44:00
 * @Description TODO 用户未登录处理类
 * @Saying 山河总静好，人事也从容
 */
@Component
public class UserAuthenticationEntryPointHandler implements AuthenticationEntryPoint {
    /**
     * 用户未登录返回结果
     * @Author Sans
     * @CreateTime 2019/10/3 9:01
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception){
        ResultUtil.responseJson(response,ResultUtil.resultCode(401,"未登录"));
    }
}
