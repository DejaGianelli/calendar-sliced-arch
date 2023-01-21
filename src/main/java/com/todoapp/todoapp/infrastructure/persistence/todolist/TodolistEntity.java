package com.todoapp.todoapp.infrastructure.persistence.todolist;

public record TodolistEntity(Long id, String guid, String name) {
    public record Table() {
        public static final String NAME = "todolist";
    }

    public record Columns() {
        public static final String ID = "id";
        public static final String GUID = "guid";
        public static final String NAME = "name";
    }
}
