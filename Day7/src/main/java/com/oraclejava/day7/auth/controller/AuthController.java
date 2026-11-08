package com.oraclejava.day7.auth.controller;

import com.oraclejava.day7.auth.dto.LoginRequestDto;
import com.oraclejava.day7.auth.dto.UserResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
// @Controller
@RestController
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
//    @PostMapping("/auth/login")
//    public String login(
//            @RequestParam String username,
//            @RequestParam String password,
//            // @RequestParam("hobby") String hobbies) {
//            // @RequestParam("hobby") String[] hobbies) {
//            @RequestParam("hobby") String[] hobbies) {
//
//        log.info("username: {}, password: {}, hobbies: {}",
//                // username, password, hobbies);
//                // username, password, Arrays.toString(hobbies));
//                username, password, hobbies);
//
//        return "redirect:/";
//    }

    // 3. 객체 타입으로 파라미터를 전송받는 방법
    @PostMapping("/auth/login")
    public String login(LoginRequestDto requestDto) {

        log.info("LoginRequestDto: {}", requestDto);

        return "redirect:/";
    }

    // 4. @PathVariable 어노테이션을 통해서 전송받는 방법
    //  - URL 경로상에 있는 특정 값을 가져오기 위해 사용하는 방법이다.
//    @GetMapping("/auth/users/{no}")
//    // public String users(@PathVariable("no") String no) {
//    public String users(@PathVariable String no) {
//
//        log.info("User No: {}", no);
//
//        return "redirect:/";
//    }

    // 뷰에 데이터를 전달하는 방법
    // 1. Model 객체 사용
//    @GetMapping("/auth/users/{no}")
//    public String users(Model model ,@PathVariable int no) {
//        UserResponseDto responseDto =
//                new UserResponseDto(no, "hong123", "인천광역시");
//
//        log.info("User No: {}", no);
//
//        model.addAttribute("user", responseDto);
//
//        return "auth/profile";
//    }

    // 2. ModelAndView 객체 사용
//    @GetMapping("/auth/users/{no}")
//    public ModelAndView users(
//            ModelAndView modelAndView, @PathVariable int no) {
//        UserResponseDto responseDto =
//                new UserResponseDto(no, "hong123", "인천광역시");
//
//        log.info("User No: {}", no);
//
//        modelAndView.addObject("user", responseDto);
//        modelAndView.setViewName("auth/profile");
//
//        return modelAndView;
//    }

    // 클라이언트로 데이터를 전달하는 방법
    // 1. @ResponseBody 어노테이션을 사용하는 방법
//    @ResponseBody
//    @GetMapping("/auth/users/{no}")
//    public Object users(@PathVariable int no) {
//        Map<String, Object> map = new HashMap<>();
//
//        map.put("no", no);
//        map.put("name", "홍길동");
//        map.put("isAdmin", true);
//        map.put("user",
//                new UserResponseDto(no, "홍길동", "인천광역시"));
//        map.put("numbers", new int[] {4, 5, 6, 7});
//
//        return map;
//    }

    // 2. @RestController 어노테이션을 사용하는 방법
    @GetMapping("/auth/users/{no}")
    public Object users(@PathVariable int no) {

        return new UserResponseDto(no, "홍길동", "인천광역시");
    }

}




