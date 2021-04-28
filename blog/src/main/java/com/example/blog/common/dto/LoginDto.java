package com.example.blog.common.dto;

import lombok.Data;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

/**
 * @author ：wanxc
 * @date ：Created in 2021/4/19 22:11
 * @description：
 */
@Data
public class LoginDto implements Serializable {
    @NotBlank(message = "昵称不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;
}
