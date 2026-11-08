package com.oraclejava.day7.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class AuthController {
    // 요청 시 사용자의 파라미터를 전송받는 방법
    // 1. HttpServletRequest 객체를 통해서 전송받는 방법
//    @PostMapping("/auth/login")
//    public String login(HttpServletRequest request, HttpSession session) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//
//        log.info("username: {}, password: {}", username, password);
//        log.info("Session ID: {}", session.getId());
//
//        return "redirect:/";
//    }

//    // 2.1. @RequestParam 어노테이션으로 전송받는 방법
//    @PostMapping("/auth/login")
//    public String login(
////            @RequestParam("username") String username, @RequestParam("password") String password) {
////            @RequestParam String username, @RequestParam String password) {
//            String username, String password) {
//
//        log.info("username: {}, password: {}", username, password);
//
//        return "redirect:/";
//    }

//    // 2.2. @RequestParam 어노테이션의 required 속성과 defaultValue 속성
//    @PostMapping("/auth/login")
//    public String login(
//            @RequestParam String username,
//            @RequestParam String password,
//            // @RequestParam(required = false) String address) {
//            @RequestParam(defaultValue = "인천광역시") String address) {
//
//        log.info("username: {}, password: {}, address: {}",
//                username, password, address);
//
//        return "redirect:/";
//    }

    // 2.3. 동일한 이름의 파라미터가 여러 개 전달되는 경우
    @PostMapping("/auth/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam("hobby") String hobbies) {

        log.info("username: {}, password: {}, hobbies: {}",
                username, password, hobbies);

        return "redirect:/";
    }
}
