package com.annotations.exerciseproblems.customannotation;
public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Anuj")
    public void completeTask() {
        System.out.println("Task is being completed");
    }
}
