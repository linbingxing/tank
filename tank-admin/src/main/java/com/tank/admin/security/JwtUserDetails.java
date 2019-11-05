package com.tank.admin.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
  * @description TODO
  * @author lbx
  * @date 2019/11/4 16:52
  * @version 1.0.0
 **/
public class JwtUserDetails extends User {

    public JwtUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

}
