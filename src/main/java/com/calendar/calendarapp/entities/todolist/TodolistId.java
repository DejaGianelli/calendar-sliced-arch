package com.calendar.calendarapp.entities.todolist;

import lombok.Getter;

@Getter
public class TodolistId {
    private final Long value;

    public TodolistId(Long value) {
        this.value = value;
    }
}
