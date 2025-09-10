package reflect;

import java.lang.reflect.Method;

public class reflectTest {
    public static void main(String[] args) throws Exception {
        //1.通过类的全额定名（包名+类名）获取Class对象
        Class<?> clazz = Class.forName("reflect.Person");
        //2.创建实例对象
        //clazz.getConstructor(String.class)：获取构造方法对象，参数是构造方法的参数类型
        //.newInstance("Alice")：调用构造方法创建对象，传入参数 "Alice"
        //返回值是一个 Object 类型的实例，实际上是 Person 对象
        Person person = (Person) clazz.getConstructor(String.class).newInstance("ALice");
        //获取 sayHello 方法对象，指定方法名和参数类型（这里是 String.class）
        Method method=clazz.getMethod("sayHello", String.class);
        //调用方法
        //method.invoke(对象, 参数...)：在 person 对象上调用 sayHello 方法
        method.invoke(person, "Bob");
    }
}
