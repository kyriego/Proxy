package staticProxy.example2;

import staticProxy.MyPersonInvocationHandler;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Person p = new Person("kyrie", 30, "usa");
        Study proxy = (Study)Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), new MyPersonInvocationHandler(p));
        proxy.read();
        proxy.write();
    }
}
