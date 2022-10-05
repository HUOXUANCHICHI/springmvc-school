package com.ablaze.controller;

import com.ablaze.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/updateBook")
    public String updateBook(Model model) {
        Book book = new Book();
        book.setBookName("大学英语");
        book.setIsbn("1234");
        book.setWriter("小唐");
        model.addAttribute("book",book);
        return "bookForm";
    }
}
