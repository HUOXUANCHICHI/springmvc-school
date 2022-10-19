package com.ablaze.controller;

import com.ablaze.pojo.DegreeType;
import com.ablaze.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ablaze
 * @Date: 2022/10/019/10:28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/updateUser")
    public String updateUser(Model model) {
        User user = new User();
        List<String> hobbyList = new ArrayList<>();
        hobbyList.add("吃饭");
        hobbyList.add("睡觉");
        ArrayList<DegreeType> degreeTypeList = new ArrayList<>();
        degreeTypeList.add(new DegreeType(1,"本科"));
        degreeTypeList.add(new DegreeType(2,"专科"));
        user.setUserName("赤赤");
        user.setName("陈煊赫");
        user.setTelephone("1145141919810");
        user.setGender("男");
        user.setHobby(hobbyList);
        user.setComments("信息学工四支部");
        user.setState("在校");
        model.addAttribute("degreeTypeList",degreeTypeList);
        model.addAttribute("user",user);
        return "userForm";
    }
}
