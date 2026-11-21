package com.oraclejava.mini.todos.controller;

import com.oraclejava.mini.todos.service.TodoService;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoApiController {
    private final TodoService todoService;

    @GetMapping("/{id}")
    public ResponseEntity<Todo> todo(@PathVariable int id) {
        Todo todo = todoService.findById(id);

        return ResponseEntity.ok(todo);
    }

}
