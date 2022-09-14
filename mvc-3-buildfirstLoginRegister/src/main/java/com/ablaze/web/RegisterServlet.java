package com.ablaze.web;
/**
 * @Author: ablaze
 * @Date: 2022/08/31/11:09
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RegisterServlet extends BaseServlet {

    @RequestMapping("/register")
    public ModelAndView handleRequest() {
        ModelAndView mView = new ModelAndView();
        mView.addObject("msg", "this is 赤赤");
        mView.setViewName("/jsp/register.jsp");
        return mView;
    }

}
