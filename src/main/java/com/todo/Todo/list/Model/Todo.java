package com.todo.Todo.list.Model;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Todo {

    private final UUID id;
    @NotBlank
    private final String title;
    @NotBlank
    private final String body;
    private final boolean isActive;

    public Todo(UUID id, String title, String body, boolean isActive) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.isActive = isActive;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public boolean isActive() {
        return isActive;
    }
}
