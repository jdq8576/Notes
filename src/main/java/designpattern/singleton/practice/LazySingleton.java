package designpattern.singleton.practice;

/**
 * @author tim
 * @date 2022/9/6 9:08 下午
 */
public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public LazySingleton getSingleton() {
        if (singleton == null) {
            synchronized (LazySingleton.class) {
                if (singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }
        return singleton;
    }

    public static void say() {
        System.out.println("懒汉式单例");
    }
}
