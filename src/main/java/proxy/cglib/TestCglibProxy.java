package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tim
 * @date 2022/9/6 9:30 下午
 */
public class TestCglibProxy {
    public static void main(String[] args) {
        UserService userService = new UserService();

        Enhancer enhancer = new Enhancer();

        enhancer.setClassLoader(TestCglibProxy.class.getClassLoader());
        enhancer.setSuperclass(userService.getClass());
        MethodInterceptor interceptor = new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("---cglib log---");
                Object object = method.invoke(userService, objects);
                return object;
            }
        };
        enhancer.setCallback(interceptor);
        UserService userService1 = (UserService) enhancer.create();
        userService1.login("tim", "889977");
        userService1.register("tim", "889977");
    }
}
