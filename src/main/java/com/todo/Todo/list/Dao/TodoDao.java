package com.todo.Todo.list.Dao;

import com.todo.Todo.list.Model.Todo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TodoDao {

    int insertTodo(UUID id, Todo todo);

    default int insertTodo(Todo todo){
        UUID id = UUID.randomUUID();
        return insertTodo(id, todo);
    }

    int updateTodoById(UUID id, Todo todo);

    List<Todo> getAllTodo();

    int deleteTodoById(UUID id);

    Optional<Todo> getTodoById(UUID id);

    List<Todo> getActiveTodos();

    List<Todo> getInactiveTodos();

    int setToActive(UUID id);

    int setToInactive(UUID id);

}
