package proxy.reflect;

/**
 * @author tim
 * @date 2022/9/7 10:51 上午
 */
public class Person {

    public static Person singleton = new Person();

    private Person() {
    }

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
