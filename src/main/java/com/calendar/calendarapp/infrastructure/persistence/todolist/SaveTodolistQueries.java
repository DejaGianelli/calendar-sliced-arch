package com.calendar.calendarapp.infrastructure.persistence.todolist;

public class SaveTodolistQueries {
    public static final String INSERT_TODOLIST = """
                INSERT INTO $todolist ($guid, $name) VALUES (:guid, :name) RETURNING $id;
            """
            .replace("$todolist", TodolistEntity.Table.NAME)
            .replace("$guid", TodolistEntity.Columns.GUID)
            .replace("$name", TodolistEntity.Columns.NAME)
            .replace("$id", TodolistEntity.Columns.ID);

    private SaveTodolistQueries() {
    }
}
