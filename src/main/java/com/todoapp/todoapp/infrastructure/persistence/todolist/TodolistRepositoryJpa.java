package com.todoapp.todoapp.infrastructure.persistence.todolist;

import com.todoapp.todoapp.entities.todolist.Todolist;
import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import com.todoapp.todoapp.entities.todolist.TodolistRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TodolistRepositoryJpa implements TodolistRepository {
    @Override
    public void save(Todolist todolist) {

    }

    @Override
    public Optional<Todolist> findByGuid(TodolistGuid guid) {
        return Optional.empty();
    }
}
