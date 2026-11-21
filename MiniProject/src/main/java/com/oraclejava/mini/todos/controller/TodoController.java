package com.oraclejava.mini.todos.controller;

import com.oraclejava.mini.todos.dto.TodoAddRequestDto;
import com.oraclejava.mini.todos.service.TodoService;
import com.oraclejava.mini.todos.vo.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
    private final TodoService todoService;

    // @GetMapping("/todos")
    @GetMapping({"", "/"})
    public ModelAndView todos(ModelAndView modelAndView) {
        List<Todo> todos = todoService.findAll();

        modelAndView.addObject("todos", todos);
        modelAndView.setViewName("todos/list");

        return modelAndView;
    }

    @GetMapping("/add")
    public String add() {
        return "todos/add";
    }

    @PostMapping("/add")
    public String add(TodoAddRequestDto todoAddRequestDto,
                      RedirectAttributes redirectAttributes) {
        Todo todo = todoAddRequestDto.toEntity();

        int result = todoService.save(todo);

        if (result == 1) {
            redirectAttributes.addFlashAttribute(
                    "message",
                    "TODO가 등록되었습니다."
            );
        } else {
            redirectAttributes.addFlashAttribute(
                    "message",
                    "TODO가 등록되지 않았습니다."
            );
        }

        return "redirect:/todos";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id,
                         RedirectAttributes redirectAttributes) {
        int result = todoService.delete(id);

        if (result == 1) {
            redirectAttributes.addFlashAttribute(
                    "message",
                    "TODO가 삭제되었습니다."
            );
        } else {
            redirectAttributes.addFlashAttribute(
                    "message",
                    "TODO가 삭제되지 않았습니다."
            );
        }

        return "redirect:/todos";
    }
}
