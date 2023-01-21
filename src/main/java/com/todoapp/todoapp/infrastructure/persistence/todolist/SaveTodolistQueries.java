package com.todoapp.todoapp.infrastructure.persistence.todolist;

public class SaveTodolistQueries {
    private SaveTodolistQueries() {
    }

    public static final String INSERT_TODOLIST = """
            INSERT INTO todolist (guid, name) VALUES (:guid, :name) RETURNING id;
            """;
}
