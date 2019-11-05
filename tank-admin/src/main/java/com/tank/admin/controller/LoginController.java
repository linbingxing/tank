package com.tank.admin.controller;

import com.tank.admin.security.JwtAuthenticatioToken;
import com.tank.admin.utils.SecurityUtils;
import com.tank.admin.vo.LoginVo;
import com.tank.common.model.Result;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
  * @description TODO
  * @author lbx
  * @date 2019/11/4 17:30
  * @version 1.0.0
 **/
@Api(value = "系统登录")
@RestController
@Slf4j
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    /**
     * 登录接口
     */
    @PostMapping(value = "/login")
    public Result login(@RequestBody LoginVo loginBean, HttpServletRequest request) throws IOException {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        // 系统登录认证
        JwtAuthenticatioToken token = SecurityUtils.login(request, username, password, authenticationManager);

        return Result.ok(token);
    }
}
