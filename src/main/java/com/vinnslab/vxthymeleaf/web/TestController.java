package com.vinnslab.vxthymeleaf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String hello() {
        return "pages/main";
    }

    @GetMapping("/charts")
    public String charts() {
        return "pages/charts";
    }
}
