package baseConfig;

import baseConfig.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class baseConfigNameTest {
    public static void main(String[] args) {

        //ClassPathXmlApplicationContext 是 ApplicationContext 的一个具体实现类，用于从类路径中加载 XML 配置文件
        //多态（父类引用指向不同的子类对象）
        //获取Ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("baseConfig.xml");

        //获取bean，返回以一个(Object)对象,参数为id号
        //BookDao  bookDao = (BookDao) context.getBean("bookDao");
        //bookDao.save();
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.save();
    }
}
