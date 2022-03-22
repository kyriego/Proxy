package staticProxy.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理：
//创建一个InvocationhandlerImplement对象
//内置一个被代理对象
//通过switch语句选择调用方法，通过被代理对象进行方法调用
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = null;
        String name = method.getName();
        switch (name){
            case "purchase":
                System.out.println("-----Proxy puchase-----");
                res = method.invoke(target, args);
                System.out.println("-----Proxy puchase-----");
                System.out.println();
                break;
            case "sell":
                System.out.println("-----Proxy sell-----");
                res = method.invoke(target, args);
                System.out.println("-----Proxy sell-----");
                System.out.println();
                break;
            case "sold":
                System.out.println("-----Proxy sold-----");
                res = method.invoke(target, args);
                System.out.println("-----Proxy sold-----");
                System.out.println();
                break;
            case "server":
                System.out.println("-----Proxy server-----");
                res = method.invoke(target, args);
                System.out.println("-----Proxy server-----");
                System.out.println();
                break;
        }
        return res;
    }
}
