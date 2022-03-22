package staticProxy.example2;

public class Person implements  Sport, Study{

    private String name;
    private int age;
    private String addr;

    public Person(){

    }

    @Override
    public void basketball() {
        System.out.println("basketball");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void read() {
        System.out.println("read");
    }

    @Override
    public void write() {
        System.out.println("write");
    }

    public Person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
