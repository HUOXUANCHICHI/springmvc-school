package com.ablaze.controller;

import com.ablaze.pojo.Book;
import com.ablaze.pojo.BookType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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
        List<String> arrayList = new ArrayList<>();
        /*HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"沈阳出版社");
        hashMap.put(2,"沈阳出版社2");
        hashMap.put(3,"沈阳出版社3");
        hashMap.put(4,"沈阳出版社4");*/
        arrayList.add("专科");
        arrayList.add("本科");
        ArrayList<BookType> bookTypeList = new ArrayList<>();
        bookTypeList.add(new BookType(1,"计算机类"));
        bookTypeList.add(new BookType(2,"大数据类"));
        book.setBookName("大学英语");
        book.setIsbn("1234");
        book.setWriter("小唐");
//        model.addAttribute("hashMap",hashMap);
        book.setGroup(arrayList);
        book.setHas("有");
        model.addAttribute("bookTypeList",bookTypeList);
        book.setType(2);
        model.addAttribute("book",book);
        return "bookForm";
    }
}
