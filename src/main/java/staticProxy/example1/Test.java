package staticProxy.example1;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        SelfPerson selfPerson = new SelfPerson("kyrie", "CH", 1);
        Business proxy = (Business)Proxy.newProxyInstance(selfPerson.getClass().getClassLoader(), selfPerson.getClass().getInterfaces(), new MyInvocationHandler(selfPerson));
        proxy.purchase();
        proxy.sell();
        proxy.sold();
        proxy.server();
    }
}
