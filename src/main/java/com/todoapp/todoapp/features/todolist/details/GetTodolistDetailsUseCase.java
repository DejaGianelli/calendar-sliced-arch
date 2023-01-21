package com.todoapp.todoapp.features.todolist.details;

import com.todoapp.todoapp.entities.todolist.Todolist;
import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import org.springframework.stereotype.Component;

@Component
public class GetTodolistDetailsUseCase {
    private final GetTodolistDetailsService service;

    public GetTodolistDetailsUseCase(GetTodolistDetailsService service) {
        this.service = service;
    }

    private static TodolistDetails createDetails(Todolist todolist) {
        return new TodolistDetails(todolist.getId().orElse(null),
                todolist.getGuid(),
                todolist.getName());
    }

    public TodolistDetails handle(GetTodolistDetailsQuery query) {
        TodolistGuid guid = new TodolistGuid(query.getGuid());

        Todolist todolist = service.handle(guid);

        return createDetails(todolist);
    }
}

