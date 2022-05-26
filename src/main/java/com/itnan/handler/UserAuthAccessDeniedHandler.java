package com.itnan.handler;

import com.itnan.utils.ResultUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.handler
 * @ClassName UserAuthAccessDeniedHandler.java
 * @createTime 2022年05月26日 13:44:00
 * @Description TODO 暂无权限处理类
 * @Saying 山河总静好，人事也从容
 */
@Component
public class UserAuthAccessDeniedHandler implements AccessDeniedHandler {
    /**
     * 暂无权限返回结果
     * @Author Sans
     * @CreateTime 2019/10/3 8:41
     */
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException exception){
        ResultUtil.responseJson(response,ResultUtil.resultCode(403,"未授权"));
    }
}
