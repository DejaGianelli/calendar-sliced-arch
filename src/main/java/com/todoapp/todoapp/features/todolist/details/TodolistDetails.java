package com.todoapp.todoapp.features.todolist.details;

import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import com.todoapp.todoapp.entities.todolist.TodolistId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TodolistDetails {
    private TodolistId id;

    private TodolistGuid guid;

    private String name;
}
