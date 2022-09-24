package com.at.fzw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @description
 * @author: fanzhengwei
 * @email: 1198350306@qq.com
 * @date: 2022/7/30 14:03
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello word!";
    }
}
