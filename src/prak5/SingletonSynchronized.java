package prak5;

public class SingletonSynchronized {
    private SingletonSynchronized() {}

    private static SingletonSynchronized instance;
    public static synchronized SingletonSynchronized getInstance() {
        if(instance == null) {
            instance = new SingletonSynchronized();
            return instance;
        }
        return instance;
    }

}
