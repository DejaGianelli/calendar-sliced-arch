package com.calendar.calendarapp.entities.todolist;

import lombok.Getter;

import java.util.UUID;

@Getter
public class TodolistGuid {
    private final UUID value;

    public TodolistGuid() {
        this.value = UUID.randomUUID();
    }

    public TodolistGuid(String guidString) {
        this.value = UUID.fromString(guidString);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
