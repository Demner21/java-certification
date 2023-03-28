package org.example.concurrent;

public class ConcurrentApp {

    private static float number;

    public static void main(String[] args) {

        System.out.println(number);

        Runnable task2 = () -> System.out.println("task2");
        Runnable task1 = () -> System.out.println("task1");
        Runnable task3 = () -> System.out.println("task3");
        System.out.println("start");
        new Thread(task1).run();
        new Thread(task1).start();
        new Thread(task2).run();
        System.out.println("end");
        new Thread(task3).start();
    }
}
