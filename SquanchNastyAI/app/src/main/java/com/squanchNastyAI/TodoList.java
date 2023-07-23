```java
package com.squanchNastyAI;

import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public String getNextTask() {
        if (!tasks.isEmpty()) {
            return tasks.get(0);
        }
        return null;
    }

    public boolean isTaskListEmpty() {
        return tasks.isEmpty();
    }

    public void clearTaskList() {
        tasks.clear();
    }
}
```