package annotation;

import java.lang.reflect.Field;

/**
 * @author tim
 * @date 2022/11/22 19:05
 */
public class Main {
    private static void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : person.getClass().getFields()) {
            // 获取Field定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(person);
                // 如果值是String:
                if (value instanceof String) {
                    String s = (String) value;
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws ReflectiveOperationException {
        Person person = new Person();
        person.city = "123123123123";
        person.name = "tim";
        check(person);
    }
}
