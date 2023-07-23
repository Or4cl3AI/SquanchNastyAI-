```java
package com.squanchNastyAI;

import java.util.ArrayList;

public class SelfPrompter {

    private ArrayList<String> todoList;

    public SelfPrompter() {
        this.todoList = new ArrayList<>();
    }

    public void addToDo(String task) {
        this.todoList.add(task);
    }

    public void removeToDo(String task) {
        this.todoList.remove(task);
    }

    public void promptNextTask() {
        if (!todoList.isEmpty()) {
            System.out.println("Next task: " + todoList.get(0));
        } else {
            System.out.println("No tasks in the list.");
        }
    }

    public void completeTask() {
        if (!todoList.isEmpty()) {
            System.out.println("Completed task: " + todoList.get(0));
            todoList.remove(0);
        } else {
            System.out.println("No tasks to complete.");
        }
    }

    public void listTasks() {
        if (!todoList.isEmpty()) {
            System.out.println("Tasks to do:");
            for (String task : todoList) {
                System.out.println(task);
            }
        } else {
            System.out.println("No tasks in the list.");
        }
    }
}
```