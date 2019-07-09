package com.zn.j1902.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 正宁 on 2019/7/5.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String houtai(){
        return "index";
    }
    @RequestMapping("/{page}")
    public String showPage(@PathVariable("page") String page){
        return page;
    }

}
