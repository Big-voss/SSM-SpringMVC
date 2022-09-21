package com.zongzhaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0921 9:48
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
        //讲逻辑视图返回
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }

}
