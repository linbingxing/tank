package com.tank.user.service.impl;

import com.tank.user.entity.SysUser;
import com.tank.user.mapper.SysUserMapper;
import com.tank.user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author lbx
 * @since 2019-11-03
 */
@Service
@Slf4j
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
