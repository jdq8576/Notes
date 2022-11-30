package proxystudy.p1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tim
 * @date 2022/11/30 20:15
 */
public class ProxyUtil {
    public static Star createProxy(Star star) {
        final Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("sing")) {
                            System.out.println("准备话筒，收钱20万");
                        } else if (method.getName().equals("dance")) {
                            System.out.println("准备场地，收钱1000万");
                        }
                        return method.invoke(star, args);
                    }
                });

        return starProxy;
    }
}
