package com.wipro.task;

import java.util.Arrays;

public class DailyTasks {

    public String doStringConcat(String s1, String s2) {
        return s1.concat(s2);
    }

    public int[] sortValues(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public boolean checkPresence(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}