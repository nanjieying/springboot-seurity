package com.itnan.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.entity
 * @ClassName SysUserRoleEntity.java
 * @createTime 2022年05月26日 14:12:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@Data
@TableName("sys_user_role")
public class SysUserRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * ID
     */
    @TableId
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 角色ID
     */
    private Long roleId;
}