package com.itnan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itnan.entity.SysMenuEntity;
import com.itnan.entity.SysRoleEntity;
import com.itnan.entity.SysUserEntity;

import java.util.List;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.service
 * @ClassName SysUserService.java
 * @createTime 2022年05月26日 14:17:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
public interface SysUserService extends IService<SysUserEntity> {

    /**
     * 根据用户名查询实体
     * @Author Sans
     * @CreateTime 2019/9/14 16:30
     * @Param  username 用户名
     * @Return SysUserEntity 用户实体
     */
    SysUserEntity selectUserByName(String username);
    /**
     * 根据用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 根据用户ID查询权限集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);

}