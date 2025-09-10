package reflect;

public class Person {
    private String name;
    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    public void sayHello(String text){
        System.out.println("Hello "+text);
    }
}
