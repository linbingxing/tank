package com.tank.user.controller;

import com.tank.common.emuns.ErrorCode;
import com.tank.common.model.Result;
import com.tank.user.api.ISysUserServiceApi;
import com.tank.user.entity.SysUser;
import com.tank.user.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author lbx
 * @since 2019-11-03
 */
@Api(value = "系统用户")
@RestController
@RequestMapping("/user/sysUser")
@Slf4j
@Service
public class SysUserController implements ISysUserServiceApi {

    @Resource
    public ISysUserService sysUserService;

    /**
     * 根据id查询系统用户
     */
    @ApiOperation(value = "根据id查询系统用户",notes= "根据id查询系统用户")
    @GetMapping(value = "/getById")
    @Override
    public Result<SysUser> getById(@RequestParam("pkid") String pkid){
        Result<SysUser> result = new Result<SysUser>();
        SysUser sysUser = sysUserService.getById(pkid);
        if (sysUser != null) {
            result.setData(sysUser);
            result.setErrorCode(ErrorCode.SUCCESS);
        }else {
            result.setErrorCode(ErrorCode.NOT_FIND);
        }
        return result;
    }


    /**
    * 根据id删除系统用户
    */
    @ApiOperation(value = "根据id删除系统用户",notes= "根据id删除系统用户")
    @DeleteMapping(value = "/deleteById/{id}")
    public Result<Object> deleteById(@PathVariable Long id){
        Result<Object> result = new Result<>();
        boolean delFlag =  sysUserService.removeById(id);
        if(delFlag){
            result.setErrorCode(ErrorCode.SUCCESS);
        }else{
            result.setErrorCode(ErrorCode.NOT_FIND);
        }
        return result;
    }

    /**
    * 新增或者更新系统用户
    */
    @ApiOperation(value = "新增或者更新系统用户")
    @PostMapping(value = "/addOrUpdate")
    public Result<Object> addOrUpdate(@RequestBody  SysUser sysUser){
        Result<Object> result = new Result<>();
        boolean success =  sysUserService.saveOrUpdate(sysUser);
        if(success){
            result.setErrorCode(ErrorCode.SUCCESS);
        }else{
            result.setErrorCode(ErrorCode.ELSE);
        }
        return result;
    }

}

