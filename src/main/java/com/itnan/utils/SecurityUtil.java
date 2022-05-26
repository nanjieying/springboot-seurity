package com.itnan.utils;

import com.itnan.security.SelfUserEntity;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.utils
 * @ClassName SecurityUtil.java
 * @createTime 2022年05月26日 11:49:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
public class SecurityUtil {
    /**
     * 私有化构造器
     */
    private SecurityUtil(){}

    /**
     * 获取当前用户信息
     */
    public static SelfUserEntity getUserInfo(){
        SelfUserEntity userDetails = (SelfUserEntity) SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
        return userDetails;
    }
    /**
     * 获取当前用户ID
     */
    public static Long getUserId(){
        return getUserInfo().getUserId();
    }
    /**
     * 获取当前用户账号
     */
    public static String getUserName(){
        return getUserInfo().getUsername();
    }
}
