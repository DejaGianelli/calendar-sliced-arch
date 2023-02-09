package com.calendar.calendarapp.features.todolist.create;

public class CreateTodolistCommandMapper {
    private CreateTodolistCommandMapper() {
    }

    public static CreateTodolistCommand map(CreateTodolistRequest request) {
        return new CreateTodolistCommand(request.name());
    }
}