package com.oraclejava.mini.todos.controller;

import com.oraclejava.mini.todos.dto.TodoAddRequestDto;
import com.oraclejava.mini.todos.service.TodoService;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    // @GetMapping("/todos")
    @GetMapping({"", "/"})
    public ModelAndView todos(ModelAndView modelAndView) {
        List<Todo> todos = todoService.findAll();

        modelAndView.addObject("todos", todos);
        modelAndView.setViewName("todos/list");

        return modelAndView;
    }

    @GetMapping("/add")
    public String add() {
        return "todos/add";
    }

    @PostMapping("/add")
    public String add(TodoAddRequestDto todoAddRequestDto) {
        System.out.println(todoAddRequestDto);

        return "redirect:/todos";
    }

}
