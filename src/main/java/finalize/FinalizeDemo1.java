package finalize;

/**
 * @author tim
 * @date 2022/11/4 09:13
 */
public class FinalizeDemo1 {
    public static void main(String[] args) {
        new FinalizeDemo1();
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("执行清理善后");
    }
}
