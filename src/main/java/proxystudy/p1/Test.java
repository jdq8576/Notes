package proxystudy.p1;

/**
 * @author tim
 * @date 2022/11/30 20:18
 */
public class Test {
    public static void main(String[] args) {
        final Star proxyStar = ProxyUtil.createProxy(new BigStar("杨超越"));

        proxyStar.sing("好日子");

        proxyStar.dance();
    }
}
