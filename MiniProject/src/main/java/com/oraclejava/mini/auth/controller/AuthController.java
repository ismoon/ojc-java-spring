package com.oraclejava.mini.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {

        modelAndView.setViewName("auth/login");

        return modelAndView;
    }
}
