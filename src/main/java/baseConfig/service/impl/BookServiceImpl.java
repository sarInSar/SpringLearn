package baseConfig.service.impl;

import baseConfig.dao.BookDao;
import baseConfig.service.BookService;

public class BookServiceImpl implements BookService {
    public BookServiceImpl() {
        System.out.println("Bean通过无参构造函数创建对象");
    }
    //5.不用再new一个对象了（交给Ioc容器注入）
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    //6.提供set方法，便于Ioc容器注入
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
