package com.calendar.calendarapp.features.todolist.create;

import com.calendar.calendarapp.entities.todolist.Todolist;
import org.springframework.stereotype.Service;

@Service
public class CreateTodolistService {
    public Todolist handle(CreateTodolistDetails details) {
        return new Todolist(details.name());
    }
}
