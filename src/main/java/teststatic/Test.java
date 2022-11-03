package teststatic;

/**
 * @author tim
 * @date 2022/9/14 7:35 下午
 */
public class Test {
    public static void main(String[] args) {
        Value v = new Value();
        int i = 0;
        v.i = 20;
        change(v, i);
        System.out.println(v.i);
    }

    public static void change(Value v, int i) {
        i = 0;
        Value value = new Value();
        v = value;
        System.out.println(value.i + " " + i);
    }
}

class Value {
    public int i = 15;
}
