```java
package com.squanchNastyAI;

import java.util.ArrayList;

public class AIEngine {

    private Personality personality;
    private Memory memory;
    private LearningModule learningModule;
    private EvolutionModule evolutionModule;
    private SelfPrompter selfPrompter;
    private TodoList todoList;

    public AIEngine() {
        this.personality = new Personality();
        this.memory = new Memory();
        this.learningModule = new LearningModule();
        this.evolutionModule = new EvolutionModule();
        this.selfPrompter = new SelfPrompter();
        this.todoList = new TodoList();
    }

    public String processInput(String input, String mode) {
        String response = "";

        if (mode.equals("chat_mode")) {
            response = personality.generateResponse(input);
            memory.storeConversation(input, response);
        } else if (mode.equals("developer_mode")) {
            ArrayList<String> tasks = ProjectSetup.setupProject(input);
            todoList.addTasks(tasks);
            response = selfPrompter.promptNextTask();
        }

        learningModule.learn(input, response);
        evolutionModule.evolve();

        return response;
    }

    public void completeTask(String task) {
        todoList.completeTask(task);
        if (!todoList.isAllTasksCompleted()) {
            selfPrompter.promptNextTask();
        }
    }

    public void generateAPK(String projectName) {
        APKGenerator.generate(projectName);
    }
}
```