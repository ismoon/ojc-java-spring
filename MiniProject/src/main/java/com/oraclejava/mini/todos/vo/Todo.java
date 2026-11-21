package com.oraclejava.mini.todos.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
public class Todo {
    private int id;
    private String title;
    private int importance;
    private int urgency;
    private LocalDate deadline;
    private String done;
}
