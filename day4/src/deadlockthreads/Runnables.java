package main.deadlockthreads;

public class Runnables {

    final Person personOne = new Person(1L, "Bob");
    final Person personTwo = new Person(2L, "Alice");

    Runnable threadOne = () -> {
        try {
            synchronized (personOne) {
                System.out.println("First Thread has one lock");
                Thread.sleep(1000);
                synchronized (personTwo) {
                    System.out.println("First thread has both locks");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    Runnable threadTwo = () -> {
        try {
            synchronized (personTwo) {
                System.out.println("Thread two has first lock");
                Thread.sleep(1000);
                synchronized (personOne) {
                    System.out.println("Thread two has both locks");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
