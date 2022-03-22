package CGlibDynamicProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class PersonMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = null;
        String name = method.getName();
        switch (name){
            case "run":
                System.out.println("---proxy run---");
                invoke = methodProxy.invoke(o, objects);
                System.out.println("---proxy run---");
            case "swim":
                System.out.println("---proxy swim---");
                invoke = methodProxy.invoke(o, objects);
                System.out.println("---proxy swim---");
        }
        return invoke;
    }
}
