package com.tank.user.api;

import com.tank.common.model.Result;
import com.tank.user.entity.SysUser;

/**
 * @interfaceName ISysUserServiceApi
 * @Description TODO
 * @Author lbx
 * @Date 2019/11/3 18:29
 * @Version 1.0.0
 **/
public interface ISysUserServiceApi {

    public Result<SysUser> getById(String pkid);

    SysUser findByLoginName(String loginName);
}

