package proxystudy.p2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tim
 * @date 2022/11/30 20:29
 */
public class ProxyUtil {
    public static UserService createProxy(UserService userService) {
        return (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("login") || method.getName().equals("deleteUsers") || method.getName().equals("selectUsers")) {
                            long startTime = System.currentTimeMillis();
                            final Object invoke = method.invoke(userService, args);
                            long endTime = System.currentTimeMillis();
                            System.out.println(method.getName() + "方法执行耗时:" + (endTime - startTime) / 1000.0 + "s");
                            return invoke;
                        }
                        return method.invoke(userService, args);
                    }
                });
    }
}
