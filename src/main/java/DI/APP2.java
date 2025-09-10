package DI;

import DI.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP2 {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext 是 ApplicationContext 的一个具体实现类，用于从类路径中加载 XML 配置文件
       //多态（父类引用指向不同的子类对象）
        //3.获取Ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean，返回以一个(Object)对象,参数为id号
        //BookDao  bookDao = (BookDao) context.getBean("bookDao");
        //bookDao.save();

        BookService service = (BookService) context.getBean("bookService");
        service.save();
    }
}
