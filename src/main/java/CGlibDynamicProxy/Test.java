package CGlibDynamicProxy;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class);
        enhancer.setCallback(new PersonMethodInterceptor());
        Person personProxy = (Person)enhancer.create();
        personProxy.swim();
        personProxy.run();
    }
}
