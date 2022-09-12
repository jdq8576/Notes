package proxy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author tim
 * @date 2022/9/7 10:55 上午
 */
public class MethodGetInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        /**
         * 私有方法不行
         * Exception in thread "main" java.lang.IllegalAccessException: Class proxy.reflect.MethodGetInstance can not access a member of class proxy.reflect.Person with modifiers "private"
         */
        final Class<?> aClass = Class.forName("proxy.reflect.Person");
        Person person = (Person) aClass.newInstance();
        person.setName("tim");
        System.out.println(person);

        Constructor constructor = null;
        try {
            constructor = aClass.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        constructor.setAccessible(true);

        Person person1 = (Person) constructor.newInstance();

        person1.setName("tim2");

        System.out.println(person1);

    }
}
