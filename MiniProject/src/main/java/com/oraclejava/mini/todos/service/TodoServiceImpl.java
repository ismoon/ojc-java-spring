package com.oraclejava.mini.todos.service;

import com.oraclejava.mini.todos.vo.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    @Override
    public List<Todo> findAll() {

        return List.of();
    }
}
