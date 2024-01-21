
package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class ToDoListTest {

    @Test
    public void testAddTask() {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Aprender TDD");
        List<String> expected = Arrays.asList("Aprender TDD");
        assertEquals(expected, toDoList.getTasks());
    }
}
