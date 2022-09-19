package com.ablaze.controller;

import com.ablaze.pojo.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: ablaze
 * @Date: 2022/09/07/10:28
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mView = new ModelAndView();
        mView.addObject("msg","欢迎Login");
        mView.setViewName("main");
        return mView;
    }

    @GetMapping("/login2/{uname}")
    public ModelAndView login2(@PathVariable String uname) {
        ModelAndView mView = new ModelAndView();
        mView.addObject("msg",uname);
        mView.setViewName("main");
        return mView;
    }

    @GetMapping("/verifyLogin")
    public ModelAndView verifyLogin(UserForm userForm) {
        String uCheck = "114514";
        String pCheck = "1919810";
        ModelAndView mView = new ModelAndView();
        if (uCheck.equals(userForm.getUsername()) && pCheck.equals(userForm.getPassword())) {
            mView.addObject("msg", "欢迎登录");
            mView.setViewName("main");
        } else {
            mView.addObject("msg", "用户或密码错误");
            mView.setViewName("login");
        }
        return mView;
    }

    @PostMapping("/verifyRegister")
    public ModelAndView verifyRegister() {
        ModelAndView mView = new ModelAndView();
        mView.addObject("msg","欢迎注册完成");
        mView.setViewName("login");
        return mView;
    }
}
