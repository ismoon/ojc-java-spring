package com.oraclejava.mini.todos.service;

import com.oraclejava.mini.todos.vo.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> findAll();

    int save(Todo todo);

    int delete(int id);

    Todo findById(int id);
}
