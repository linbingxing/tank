package com.tank.admin.security;

import com.google.common.collect.Lists;
import com.tank.user.api.ISysUserServiceApi;
import com.tank.user.entity.SysUser;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
  * @description TODO
  * @author lbx
  * @date 2019/11/4 16:55
  * @version 1.0.0
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Reference
    private ISysUserServiceApi sysUserServiceApi;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        SysUser sysUser = sysUserServiceApi.findByLoginName(userName);
        if (sysUser == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        String password = new BCryptPasswordEncoder().encode("123");
        sysUser.setPassword(password);
        //设置权限
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        grantedAuthorities.add(new GrantedAuthorityImpl("sys:user:view"));
        return new JwtUserDetails(userName, sysUser.getPassword(), grantedAuthorities);
    }
}
