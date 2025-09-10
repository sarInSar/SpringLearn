package baseConfig;

import baseConfig.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class baseConfigScopeTest {
    public static void main(String[] args) {


        //获取Ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("baseConfig.xml");
        //获取bean，返回以一个(Object)对象,参数为id号
        BookService bookService1 = (BookService) context.getBean("bookService");
        System.out.println(bookService1);
        bookService1.save();
        BookService bookService2 = (BookService)context.getBean("service");
        System.out.println(bookService2);
        bookService2.save();
    }
}
