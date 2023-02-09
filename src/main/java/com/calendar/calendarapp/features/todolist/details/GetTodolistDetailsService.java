package com.calendar.calendarapp.features.todolist.details;

import com.calendar.calendarapp.entities.todolist.Todolist;
import com.calendar.calendarapp.entities.todolist.TodolistRepository;
import com.calendar.calendarapp.entities.todolist.TodolistGuid;
import org.springframework.stereotype.Service;

@Service
public class GetTodolistDetailsService {
    private final TodolistRepository todolistRepository;

    public GetTodolistDetailsService(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    Todolist handle(TodolistGuid guid) {
        return todolistRepository.findByGuid(guid)
                .orElseThrow(TodolistNotFoundException::new);
    }
}
