package com.ablaze.web;
/**
 * @Author: ablaze
 * @Date: 2022/08/31/11:09
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginServlet extends BaseServlet {

    @RequestMapping("/login")
    public ModelAndView handleRequest() {
        ModelAndView mView = new ModelAndView();
        mView.addObject("username", "this is username");
        mView.addObject("password", "this is password");
        mView.setViewName("/jsp/login.jsp");
        return mView;
    }

}
