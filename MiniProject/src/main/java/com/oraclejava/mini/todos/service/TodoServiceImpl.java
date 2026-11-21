package com.oraclejava.mini.todos.service;

import com.oraclejava.mini.todos.mapper.TodoMapper;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final TodoMapper todoMapper;

    @Override
    public List<Todo> findAll() {

        return todoMapper.selectAll();
    }

    @Override
    public int save(Todo todo) {
        int result = 0;

        result = todoMapper.insertTodo(todo);

        return result;
    }
}
