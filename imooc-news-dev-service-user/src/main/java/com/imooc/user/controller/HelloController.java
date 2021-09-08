package com.imooc.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author haoyu
 * @date 2021/9/8 20:55
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public Object hello(){
        return "hello";
    }

}
