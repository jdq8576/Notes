package proxy.reflect;

/**
 * @author tim
 * @date 2022/9/7 10:51 上午
 */
public class MethodGetClass {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);


        personClass = (Class<Person>) Person.singleton.getClass();
        System.out.println(personClass);

        try {
            personClass = (Class<Person>) Class.forName("proxy.reflect.Person");
            System.out.println(personClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
