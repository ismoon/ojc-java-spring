package com.oraclejava.mini.todos.service;

import com.oraclejava.mini.todos.vo.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> findAll();

    int save(Todo todo);

    int delete(int id);

    Optional<Todo> findById(int id);
}
