package designpattern.singleton.practice;

/**
 * @author tim
 * @date 2022/9/6 9:07 下午
 */
public class HungrySingleton {

    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }

    public static void say() {
        System.out.println("我是饿汉式单例!");
    }
}
