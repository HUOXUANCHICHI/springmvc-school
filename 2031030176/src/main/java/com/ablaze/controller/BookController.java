package com.ablaze.controller;

import com.ablaze.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: ablaze
 * @Date: 2022/09/021/10:28
 */
@Controller
@RequestMapping("/book")
public class BookController {

    /*@PostMapping("/addBook")
    public ModelAndView addBook(Book book) {
        ModelAndView mView = new ModelAndView();
        mView.addObject("book", book);
        mView.setViewName("bookResult");
        return mView;
    }*/

    @PostMapping("/addBook")
    public String addBook(Book book, Model model, HttpSession httpSession, HttpServletRequest httpServletRequest) {
        System.out.println(httpSession.getAttribute("msg")+"addBook");
        System.out.println(httpSession.getAttribute("msg"));
//        model.addAttribute("msg", "欢迎登录");
        model.addAttribute("book", book);
//        return "redirect:/jsp/bookResult.jsp";
        return "forward:/jsp/bookResult.jsp";
    }
}
