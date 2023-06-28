package com.project.todolist;

import java.util.LinkedList;

public class Todolist {
    private LinkedList<Task> tasks;

    public Todolist(){
        tasks = new LinkedList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task added");
    }

    public boolean removeTask(int taskId) {
        // Find the task to remove
        Task taskToRemove = null;
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                taskToRemove = task;
                break;
            }
        }

        // Remove the task
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task removed successfully.");
            // Update the IDs after task removal
            updateIdsAfterTaskRemoval();
        } else {
            System.out.println("Task not found.");
        }
        return false;
    }
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (Task task : tasks) {
                System.out.println("ID: " + task.getId());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Due Date: " + task.getDueDate());
                System.out.println();
            }
        }
    }

    public void updateIdsAfterTaskRemoval() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            task.setId(i + 1);
        }
    }

}
