package com.todoapp.todoapp.features.todolist.details;

import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import com.todoapp.todoapp.entities.todolist.TodolistId;

public record TodolistDetails(TodolistId id, TodolistGuid guid, String name) {
}
