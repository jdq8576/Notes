package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tim
 * @date 2022/9/6 9:41 下午
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---proxy log---");
                Object ret = method.invoke(userService, args);
                return ret;
            }
        };

        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), userService.getClass().getInterfaces(), handler);

        userServiceProxy.login("tim", "889977");
    }
}
