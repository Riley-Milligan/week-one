package main.assignmentsix;


public class SampleSingleton {

    private static  volatile SampleSingleton instance = null;

    private SampleSingleton(){};

    public static SampleSingleton getInstance() {
        synchronized (instance) {
            if (instance == null) {

                synchronized (SampleSingleton.class) {
                    if (instance == null) {
                        instance = new SampleSingleton();
                    }
                }
            }
        }

        return instance;
    }

}