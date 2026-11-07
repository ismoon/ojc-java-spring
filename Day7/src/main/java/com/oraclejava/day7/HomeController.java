package com.oraclejava.day7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {

        return "home";
    }

    @GetMapping("/di")
    public String id() {

        return "redirect:/";
    }
}
