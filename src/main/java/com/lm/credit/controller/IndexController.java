package com.lm.credit.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "搞事情么!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(IndexController.class, args);
    }
}