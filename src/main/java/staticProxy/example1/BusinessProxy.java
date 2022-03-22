package staticProxy.example1;

//静态代理：包含了一个被代理对象，实现了被代理接口，通过被代理对象来完成被代理接口中的方法
public class BusinessProxy implements Business {

    private SelfPerson person;

    public BusinessProxy(SelfPerson person){
        this.person = person;
    }

    @Override
    public void purchase() {
        System.out.println("-----proxy-----");
        person.purchase();
        System.out.println("-----proxy-----");
    }

    @Override
    public void sell() {
        System.out.println("-----proxy-----");
        person.sell();
        System.out.println("-----proxy-----");
    }

    @Override
    public void sold() {
        System.out.println("-----proxy-----");
        person.sold();
        System.out.println("-----proxy-----");
    }

    @Override
    public void server() {
        System.out.println("-----proxy-----");
        person.server();
        System.out.println("-----proxy-----");
    }
}
