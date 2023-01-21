package com.todoapp.todoapp.infrastructure.persistence.todolist;

public class Queries {
    public static String SAVE_TODOLIST_QUERY = """
            INSERT INTO todolist (guid, name) VALUES (:guid, :name) RETURNING id;
            """;
}
