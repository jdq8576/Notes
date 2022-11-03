package trycatch;

/**
 * @author tim
 * @date 2022/9/14 7:22 下午
 */
public class Test {
    public static void main(String[] args) {
        try {
            int i = 100 / 0;
            System.out.println(1);
        } catch (Exception e) {
            throw new RuntimeException();
        } finally {
            System.out.println(2);
        }
        System.out.println(3);
    }
}
