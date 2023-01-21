package com.todoapp.todoapp.entities.todolist;

import lombok.Getter;

import java.util.Optional;

@Getter
public class Todolist {
    private final TodolistGuid guid;
    private final String name;
    private TodolistId id;

    public Todolist(String name) {
        this.guid = new TodolistGuid();
        this.name = name;
    }

    public Optional<TodolistId> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(TodolistId id) {
        this.id = id;
    }
}
