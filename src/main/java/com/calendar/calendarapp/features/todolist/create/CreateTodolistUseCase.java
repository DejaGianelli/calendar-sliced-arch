package com.calendar.calendarapp.features.todolist.create;

import com.calendar.calendarapp.entities.todolist.Todolist;
import com.calendar.calendarapp.entities.todolist.TodolistGuid;
import com.calendar.calendarapp.entities.todolist.TodolistRepository;
import org.springframework.stereotype.Component;

@Component
public class CreateTodolistUseCase {
    private final CreateTodolistService service;

    private final TodolistRepository todolistRepository;

    public CreateTodolistUseCase(CreateTodolistService service, TodolistRepository todolistRepository) {
        this.service = service;
        this.todolistRepository = todolistRepository;
    }

    public TodolistGuid handle(CreateTodolistCommand command) {
        Todolist todolist = service.handle(new CreateTodolistDetails(command.getName()));
        todolistRepository.save(todolist);
        return todolist.getGuid();
    }
}