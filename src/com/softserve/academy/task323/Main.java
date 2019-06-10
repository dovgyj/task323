package com.softserve.academy.task323;

import com.softserve.academy.task323.task.Task;

public class Main {

    public static void main(String[] args) {

        Task task = new Task();

        try {
            int[] rez = task.run(94);
            System.out.println(rez[0] + " " + rez[1] + " " + rez[2] + " " + rez[3]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
