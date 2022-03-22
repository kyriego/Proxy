package CGlibDynamicProxy;

public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void run(){
        System.out.println("---running---");
    }

    public void swim(){
        System.out.println("---swimming---");
    }
}
