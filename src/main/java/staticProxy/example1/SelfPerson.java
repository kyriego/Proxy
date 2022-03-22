package staticProxy.example1;

//二.实现接口，即被代理类
public class SelfPerson implements Business {

    private String name;
    private String addr;
    private int id;

    public SelfPerson() {
    }

    public SelfPerson(String name, String addr, int id) {
        this.name = name;
        this.addr = addr;
        this.id = id;
    }

    @Override
    public void purchase() {
        System.out.println("Purchase success!");
    }

    @Override
    public void sell() {
        System.out.println("Sell success!");
    }

    @Override
    public void sold() {
        System.out.println("Sold success!");
    }

    @Override
    public void server() {
        System.out.println("Wonderful server!");
    }
}
