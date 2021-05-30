package com.nowcoder.community.controller;

import com.nowcoder.community.config.AlphaConfig;
import com.nowcoder.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @RequestMapping("/hello")
    @ResponseBody
    public String alpha() {
        return "hello spring boot";
    }

    @ResponseBody
    @RequestMapping("/data")
    public String getData() {
        return alphaService.find();
    }
}
