package com.tank.user.service.impl;

import com.tank.user.entity.SysLog;
import com.tank.user.mapper.SysLogMapper;
import com.tank.user.service.ISysLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author lbx
 * @since 2019-11-03
 */
@Service
@Slf4j
public class SysLogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements ISysLogService {

}
