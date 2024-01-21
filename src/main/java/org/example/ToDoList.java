package org.example;
package com.ejemplo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
