package staticProxy;

import staticProxy.example1.MyInvocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyPersonInvocationHandler implements InvocationHandler {

    private Object target;

    public MyPersonInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = null;
        String name = method.getName();
        switch (name){
            case "read":
                System.out.println("---proxy read---");
                invoke = method.invoke(target, args);
                System.out.println("---proxy write---");
                break;
            case "write":
                System.out.println("---proxy write---");
                invoke = method.invoke(target, args);
                System.out.println("---proxy write---");
                break;
        }

        return invoke;
    }
}
