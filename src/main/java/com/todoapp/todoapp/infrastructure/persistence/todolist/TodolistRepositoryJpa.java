package com.todoapp.todoapp.infrastructure.persistence.todolist;

import com.todoapp.todoapp.entities.todolist.Todolist;
import com.todoapp.todoapp.entities.todolist.TodolistGuid;
import com.todoapp.todoapp.entities.todolist.TodolistId;
import com.todoapp.todoapp.entities.todolist.TodolistRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

import static com.todoapp.todoapp.infrastructure.persistence.todolist.SaveTodolistQueries.INSERT_TODOLIST;

@Repository
public class TodolistRepositoryJpa implements TodolistRepository {

    private final EntityManager entityManager;

    public TodolistRepositoryJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Todolist todolist) {
        Query query = entityManager.createNativeQuery(INSERT_TODOLIST, BigInteger.class);

        long generatedId = ((BigInteger) query.setParameter("guid", todolist.getGuid().toString())
                .setParameter("name", todolist.getName())
                .getSingleResult())
                .longValue();

        todolist.setId(new TodolistId(generatedId));
    }

    @Override
    public Optional<Todolist> findByGuid(TodolistGuid guid) {
        return Optional.empty();
    }
}
