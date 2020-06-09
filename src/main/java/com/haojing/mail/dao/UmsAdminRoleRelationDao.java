package com.haojing.mail.dao;

import com.haojing.mail.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * @author jiange
 * @date 2020/6/9 14:23
 */
@Repository
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
