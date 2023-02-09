package com.calendar.calendarapp.features.todolist.create;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateTodolistCommand {
    private String name;
}