package com.project.todolist;

public class Task {
    private static int nextId = 1;

    private int id;
    private String title;
    private String description;
    private String dueDate;

    public Task(String title, String description, String dueDate) {
        this.id = nextId++;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }
}
