package com.todoapp.todoapp.features.todolist.details;

import com.todoapp.todoapp.entities.todolist.Todolist;
import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import com.todoapp.todoapp.entities.todolist.TodolistRepository;
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
