package com.zongzhaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0921 13:17
 */
@Controller
//@RequestMapping("/test")
public class TestRequestMappingController {
    //此时控制器方法所匹配的请求路径为/test/hello
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.GET,RequestMethod.POST},
            //params = {"username","!password","age=20","gender!=男"},
            headers = {"referer"}
            )
    public String hello(){
    return "success";
    }

    @RequestMapping("/**/test/ant")
    public String testAnt(){
        return "success";
    }

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("username")  String username , @PathVariable("id") Integer id){
        System.out.println("username:"+username+",id:"+id);
        return "success";
    }


}
