package com.oraclejava.mini.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AuthController {

    @GetMapping("/login")
    public ModelAndView login(ModelAndView modelAndView) {

        modelAndView.setViewName("auth/login");

        return modelAndView;
    }

    @GetMapping("/access-denied")
    public String accessDenied(RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute(
                "message",
                "접근 권한이 없습니다."
        );

        return "redirect:/todos";
    }
}
