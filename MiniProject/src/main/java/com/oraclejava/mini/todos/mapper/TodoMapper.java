package com.oraclejava.mini.todos.mapper;

import com.oraclejava.mini.todos.vo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TodoMapper {
    List<Todo> selectAll();

    int insertTodo(Todo todo);

    int deleteTodo(@Param("id") int id);

    Optional<Todo> selectById(@Param("id") int id);

    int updateTodo(Todo todo);
}
