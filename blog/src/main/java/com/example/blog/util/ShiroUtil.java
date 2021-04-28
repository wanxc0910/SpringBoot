package com.example.blog.util;

import com.example.blog.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/27 21:30
 * @description：
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
