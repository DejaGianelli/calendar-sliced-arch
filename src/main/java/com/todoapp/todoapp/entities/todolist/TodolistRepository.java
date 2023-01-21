package com.todoapp.todoapp.entities.todolist;

import java.util.Optional;

public interface TodolistRepository {
    void save(Todolist todolist);

    Optional<Todolist> findByGuid(TodolistGuid guid);
}
