package prak5;

public class Test {

    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println("Eager Initialization: " + (singletonEager1 == singletonEager2));

        SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        System.out.println("Enum Singleton: " + (singletonEnum1 == singletonEnum2));

        SingletonSynchronized singletonSync1 = SingletonSynchronized.getInstance();
        SingletonSynchronized singletonSync2 = SingletonSynchronized.getInstance();
        System.out.println("Synchronized Singleton: " + (singletonSync1 == singletonSync2));
    }

}
