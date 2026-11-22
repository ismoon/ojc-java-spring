package com.oraclejava.mini.todos.controller;

import com.oraclejava.mini.todos.dto.TodoEditRequestDto;
import com.oraclejava.mini.todos.service.TodoService;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoApiController {
    private final TodoService todoService;

    @GetMapping("/{id}")
    public ResponseEntity<Todo> todo(@PathVariable int id) {
        Todo todo = todoService.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo Not found"));

        return ResponseEntity.ok(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> update(@PathVariable int id,
               @RequestBody TodoEditRequestDto todoEditRequestDto) {
        Todo todo = todoService.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo Not found"));

        todo.setTitle(todoEditRequestDto.getTitle());
        todo.setImportance(todoEditRequestDto.getImportance());
        todo.setUrgency(todoEditRequestDto.getUrgency());
        todo.setDeadline(todoEditRequestDto.getDeadline());
        todo.setDone(todoEditRequestDto.getDone());

        todoService.save(todo);

        return ResponseEntity.ok(todo);
    }



}
