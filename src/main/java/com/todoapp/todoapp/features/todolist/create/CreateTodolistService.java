package com.todoapp.todoapp.features.todolist.create;

import com.todoapp.todoapp.entities.todolist.Todolist;
import org.springframework.stereotype.Service;

@Service
public class CreateTodolistService {
    public Todolist handle(CreateTodolistDetails details) {
        return new Todolist(details.name());
    }
}
