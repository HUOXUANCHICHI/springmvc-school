package com.ablaze.controller;

import com.ablaze.pojo.Book;
import com.ablaze.pojo.UserForm;
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
@RequestMapping("/book")
public class BookController {

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

    @PostMapping("/addBook")
    public ModelAndView addBook(Book book) {
        ModelAndView mView = new ModelAndView();
        mView.addObject("bname",book.getBname());
        mView.addObject("isbn",book.getIsbn());
        mView.addObject("author",book.getAuthor());
        mView.setViewName("bookResult");
        return mView;
    }
}
