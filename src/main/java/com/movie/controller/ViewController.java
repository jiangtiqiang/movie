package com.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {


    @RequestMapping("index")
    public String index(ModelMap map) {
        System.out.println("fine");
        // 加入一个属性，用来在模板中读取
        map.addAttribute("name", "jake");
        map.addAttribute("bookTitle", "jpm");
        return "index";
    }


    @RequestMapping("novel")
    public String novel(ModelMap map) {
        System.out.println("fine");
        // 加入一个属性，用来在模板中读取
        map.addAttribute("name", "jake");
        map.addAttribute("bookTitle", "jpm");
        return "novel";
    }


}
