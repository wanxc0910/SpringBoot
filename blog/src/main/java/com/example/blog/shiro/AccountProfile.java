package com.example.blog.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/27 21:31
 * @description：
 */
@Data
public class AccountProfile implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;

    private String avatar;

    private String email;
}
