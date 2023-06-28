package com.project.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Todolist listMain = new Todolist();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter task due date: ");
                    String dueDate = scanner.nextLine();
                    listMain.addTask(new Task(title, description, dueDate));
                    System.out.println("Task added successfully.");
                }
                case 2 -> {
                    System.out.print("Enter task ID to remove: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    if (listMain.removeTask(taskId)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                }
                case 3 -> {
                    System.out.println("Tasks:");
                    listMain.displayTasks();
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
