package com.calendar.calendarapp.infrastructure.persistence.todolist;

import com.calendar.calendarapp.entities.todolist.Todolist;
import com.calendar.calendarapp.entities.todolist.TodolistGuid;
import com.calendar.calendarapp.entities.todolist.TodolistId;
import com.calendar.calendarapp.entities.todolist.TodolistRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public class TodolistRepositoryJpa implements TodolistRepository {

    private final EntityManager entityManager;

    public TodolistRepositoryJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Todolist todolist) {
        Query query = entityManager.createNativeQuery(SaveTodolistQueries.INSERT_TODOLIST, BigInteger.class);

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
