package com.todoapp.todoapp.features.todolist.details;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/todolists")
public class GetTodolistDetailsController {

    private final GetTodolistDetailsUseCase useCase;

    public GetTodolistDetailsController(GetTodolistDetailsUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping("/{guid}")
    public ResponseEntity<?> handle(@PathVariable String guid) {

        GetTodolistDetailsQuery query = new GetTodolistDetailsQuery(guid);

        TodolistDetails details = useCase.handle(query);

        TodolistResponse response = createResponse(details);

        return ResponseEntity.ok(response);
    }

    private static TodolistResponse createResponse(TodolistDetails details) {
        return new TodolistResponse(details.id().getValue(), details.name());
    }
}
