package com.jacken.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * springboot集成freemarker
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public  String index(ModelMap map){
        map.addAttribute("name","美丽的天使");
        return  "index";
    }
}
