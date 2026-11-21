package com.oraclejava.mini.todos.controller;

import com.oraclejava.mini.todos.service.TodoService;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/todos")
    public String todos() {
        List<Todo> todos = todoService.findAll();

        System.out.println(todos);

        return "todos/list";
    }
}
