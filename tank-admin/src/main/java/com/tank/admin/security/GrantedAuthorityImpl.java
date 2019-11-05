package com.tank.admin.security;

import org.springframework.security.core.GrantedAuthority;

/**
  * @description 权限封装
  * @author lbx
  * @date 2019/11/4 17:19
  * @version 1.0.0
 **/
public class GrantedAuthorityImpl  implements GrantedAuthority {

    private static final long serialVersionUID = 1L;

    private String authority;

    public GrantedAuthorityImpl(String authority) {
        this.authority = authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
