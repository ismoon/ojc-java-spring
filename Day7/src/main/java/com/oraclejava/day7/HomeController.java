package com.oraclejava.day7;

import com.oraclejava.day7.owner.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private Owner owner;

    @GetMapping("/")
    public String home() {

        return "home";
    }

    @GetMapping("/di")
    public String id() {

        System.out.println(owner);

        return "redirect:/";
    }
}
