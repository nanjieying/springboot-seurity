package com.itnan.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.entity
 * @ClassName SysUserEntity.java
 * @createTime 2022年05月26日 14:12:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 用户ID
     */
    @TableId
    private Long userId;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 状态:NORMAL正常  PROHIBIT禁用
     */
    private String status;
}
