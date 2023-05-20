package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "welcome! version=2";
    }

    @RequestMapping("/test")
    public String test(){
        return "test!";
    }

    @RequestMapping("/xiaobai")
    public String xiaobai(){
        return "xiaobai";
    }

    @RequestMapping("/xiaohei")
    public String xiaohei(){
        return "xiaohei";
    }

    /*在master分支修改的内容
    * master分支*/
    @RequestMapping("/ceshi")
    public String ceshi(){
        return "xiaohei";
    }
    /*b1分支新增的内容*/
}
