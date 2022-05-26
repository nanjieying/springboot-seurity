package com.itnan.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.entity
 * @ClassName SysRoleEntity.java
 * @createTime 2022年05月26日 14:11:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@Data
@TableName("sys_role")
public class SysRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 角色ID
     */
    @TableId
    private Long roleId;
    /**
     * 角色名称
     */
    private String roleName;
}
