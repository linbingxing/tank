package com.tank.admin.controller;

import com.tank.common.emuns.ErrorCode;
import com.tank.common.model.Result;
import com.tank.user.api.ISysUserServiceApi;
import com.tank.user.entity.SysUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
  * @description TODO
  * @author lbx
  * @date 2019/11/3 18:53
  * @version 1.0.0
 **/
@Api(value = "系统用户")
@RestController
@RequestMapping("/user/sysUser")
@Slf4j
public class SysUserController {

    @Reference
    private ISysUserServiceApi sysUserServiceApi;
    /**
     * 根据id查询系统用户
     */
    @ApiOperation(value = "根据id查询系统用户",notes= "根据id查询系统用户")
    @GetMapping(value = "/getById")
    public Result<SysUser> getById(@RequestParam("pkid") String pkid){
        Result<SysUser> result = sysUserServiceApi.getById(pkid);
        return result;
    }

}
