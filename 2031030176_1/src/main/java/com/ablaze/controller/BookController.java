package com.ablaze.controller;

import com.ablaze.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ablaze
 * @Date: 2022/09/021/10:28
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @PostMapping("/addBook")
    public String addBook(Book book, Model model) {

        double price = (book.getPrice() * 0.8);
        book.setPrice(price);
        model.addAttribute("book", book);
        return "forward:/jsp/bookResult.jsp";

    }
}
