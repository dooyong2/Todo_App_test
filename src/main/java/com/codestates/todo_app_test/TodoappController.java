package com.codestates.todo_app_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoappController {

    @GetMapping("/")
    public String helloMarId() {
        return "To-do Application !";
    }
}
