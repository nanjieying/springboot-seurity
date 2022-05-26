package com.itnan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itnan.entity.SysMenuEntity;
import com.itnan.entity.SysRoleEntity;
import com.itnan.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author NJY
 * @version V1.0
 * @Package com.itnan.mapper
 * @ClassName SysUserMapper.java
 * @createTime 2022年05月26日 14:15:00
 * @Description TODO
 * @Saying 山河总静好，人事也从容
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

    /**
     * 通过用户ID查询角色集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysRoleEntity> 角色名集合
     */
    List<SysRoleEntity> selectSysRoleByUserId(Long userId);
    /**
     * 通过用户ID查询权限集合
     * @Author Sans
     * @CreateTime 2019/9/18 18:01
     * @Param  userId 用户ID
     * @Return List<SysMenuEntity> 角色名集合
     */
    List<SysMenuEntity> selectSysMenuByUserId(Long userId);

}
