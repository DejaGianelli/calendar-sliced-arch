package com.calendar.calendarapp.features.todolist.create;

import com.calendar.calendarapp.entities.todolist.TodolistGuid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/v1/todolists")
public class CreateTodolistController {

    private final CreateTodolistUseCase useCase;

    public CreateTodolistController(CreateTodolistUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public ResponseEntity<?> handle(@RequestBody CreateTodolistRequest request,
                                    UriComponentsBuilder uriComponentsBuilder) {
        CreateTodolistCommand command = CreateTodolistCommandMapper.map(request);

        TodolistGuid guid = useCase.handle(command);

        URI location = uriComponentsBuilder.path("/v1/todolists/{guid}")
                .buildAndExpand(guid.toString())
                .toUri();

        return ResponseEntity.created(location)
                .build();
    }
}
