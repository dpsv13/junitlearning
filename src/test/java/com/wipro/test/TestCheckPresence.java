package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {

        DailyTasks obj = new DailyTasks();

        int[] arr = {10, 20, 30, 40, 50};

        assertTrue(obj.checkPresence(arr, 30));

        assertFalse(obj.checkPresence(arr, 60));
    }
}