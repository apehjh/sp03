package com.xxx.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @classname：MyController
 * @author：hejunhui
 * @version：1.0
 * @Description:TODO
 * @date：2022/7/28-15:28
 * @since:jdk1.8
 */
@Controller// @Controller，这个注解是用来返回一个页面或者视图层的
public class MyController {

//    @GetMapping("hello")
//    public String hello(){
//        return "海绵宝宝";
//    }
    @GetMapping("/uu")
    public String the(){
        System.out.println("aaa");
        return "success";
    }

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name","===========");
        return "hello";

    }
}
