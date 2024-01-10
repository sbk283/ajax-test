package com.example.demo.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/main")
    public String showMain() {
        return "like";
    }

    @GetMapping("/home/showLike")
    public String showLike() {
        return "like";
    }

    @GetMapping("/login")
    public String login() {
        return "like";
    }
}