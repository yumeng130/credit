package com.lm.credit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Index";
    }

}