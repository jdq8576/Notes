package designpattern.singleton;

public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    public static void say() {
        System.out.println("我是饿汉式单例");
    }
}
