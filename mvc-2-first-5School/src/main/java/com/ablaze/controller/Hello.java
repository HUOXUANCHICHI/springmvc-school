package com.ablaze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: ablaze
 * @Date: 2022/09/07/10:28
 */
@Controller
@RequestMapping("/hello")
public class Hello {

    @GetMapping("/verifyLogin")
    public ModelAndView verifyLogin() {
        ModelAndView mView = new ModelAndView();
        mView.addObject("msg","欢迎登录");
        mView.setViewName("main");
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
