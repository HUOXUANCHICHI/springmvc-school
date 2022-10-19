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
@SessionAttributes(value = {"msg"})
public class Hello {


    @GetMapping("/verifyLogin")
    public ModelAndView verifyLogin(UserForm userForm) {
        String uCheck = "2031030176";
        ModelAndView mView = new ModelAndView();
        if (uCheck.equals(userForm.getUsername())/*true*/) {
            mView.addObject("msg", userForm.getUsername()+"欢迎登录");
            mView.setViewName("redirect:/book/updateBook");
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
