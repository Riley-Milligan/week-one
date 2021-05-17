package main.deadlockthreads;

import main.deadlockthreads.Runnables;

public class DeadlockApp {

    public static void main(String[] args) {

        Runnables runnables = new Runnables();

        System.out.println("Starting Threads");

        //Run threads
        new Thread(runnables.threadOne).start();
        new Thread(runnables.threadTwo).start();

        System.out.println("Threads started");
    }
}
