package designpattern.factory.practice;

/**
 * @author tim
 * @date 2022/9/6 9:17 下午
 */
public class TestFactory {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        final ConcreteProductOne concreteProductOne = creator.create(ConcreteProductOne.class);
        concreteProductOne.method();
    }
}
