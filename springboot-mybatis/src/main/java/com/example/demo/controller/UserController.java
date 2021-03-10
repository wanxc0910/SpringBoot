package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.idUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 19:45
 * @description：
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Object addUser(HttpServletRequest req) {
        JSONObject jsonObject = new JSONObject();

        User user = new User();
        String id = idUtil.getId();
        String userName = req.getParameter("userName").trim();
        String password = req.getParameter("password").trim();

        if (userName.isEmpty() || password.isEmpty()) {
            jsonObject.put("code", "0");
            jsonObject.put("msg", "失败，姓名或密码为空！");
            return jsonObject;
        }

        user.setId(id);
        user.setUserName(userName);
        user.setPassword(password);

        boolean rs = userService.addUser(user);


        if (rs) {
            jsonObject.put("code", "1");
            jsonObject.put("msg", "成功！");
            return jsonObject;
        }

        jsonObject.put("code", "0");
        jsonObject.put("msg", "失败！");

        return jsonObject;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Object deleteUserById(HttpServletRequest req) {
        String id = req.getParameter("id");
        return userService.deleteUser(id);
    }
}
