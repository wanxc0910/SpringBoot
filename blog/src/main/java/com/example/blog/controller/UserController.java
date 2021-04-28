package com.example.blog.controller;


import com.example.blog.common.lang.Result;
import com.example.blog.entity.User;
import com.example.blog.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author wanxc
 * @since 2021-04-19
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 验证用户是否登录测试
     *
     * @return
     */
    @RequiresAuthentication
    @GetMapping("/index")
    public Object index() {
        return Result.getResult("200", "", userService.getById(1));
    }

    /**
     * 保存
     *
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.success(user);
    }
}
