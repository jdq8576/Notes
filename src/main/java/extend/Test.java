package extend;

/**
 * @author tim
 * @date 2022/9/14 7:17 下午
 */

class A {
    static {
        System.out.println("Load A");
    }

    public A() {
        System.out.println("Create A");
    }
}

class B extends A {
    static {
        System.out.println("Load B");
    }

    public B() {
        System.out.println("Create B");
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
