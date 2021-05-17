package main.doublechecksingleton;

public class DoubleLockSingleton {

    private static volatile DoubleLockSingleton instance = null;

    private DoubleLockSingleton() {};

    public static DoubleLockSingleton getInstance() {
        synchronized (instance) {
            if (instance == null) {

                synchronized (DoubleLockSingleton.class) {
                    if (instance == null) {
                        instance = new DoubleLockSingleton();
                    }
                }
            }

            return instance;
        }
    }

}
