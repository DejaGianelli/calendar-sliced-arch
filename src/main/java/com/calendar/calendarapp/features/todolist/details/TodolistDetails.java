package com.calendar.calendarapp.features.todolist.details;

import com.calendar.calendarapp.entities.todolist.TodolistId;
import com.calendar.calendarapp.entities.todolist.TodolistGuid;

public record TodolistDetails(TodolistId id, TodolistGuid guid, String name) {
}
