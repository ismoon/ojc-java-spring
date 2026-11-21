package com.oraclejava.mini.todos.mapper;

import com.oraclejava.mini.todos.vo.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();

    int insertTodo(Todo todo);
}
