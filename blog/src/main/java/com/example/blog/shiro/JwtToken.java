package com.example.blog.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/19 21:37
 * @description：
 */
public class JwtToken implements AuthenticationToken {
    private String token;

    public JwtToken(String jwt) {
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
