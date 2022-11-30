package proxystudy.p2;

/**
 * @author tim
 * @date 2022/11/30 20:32
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        final UserService userServiceProxy = ProxyUtil.createProxy(new UserServiceImpl());
        userServiceProxy.login("admin", "123456");

        userServiceProxy.selectUsers();

        userServiceProxy.deleteUsers();
    }
}
