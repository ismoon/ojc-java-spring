package com.oraclejava.mini.todos.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
@RequiredArgsConstructor
public class TodoAddRequestDto {
    private final String title;
    private final int importance;
    private final int urgency;
    private final LocalDate deadline;
}
