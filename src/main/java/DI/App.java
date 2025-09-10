package DI;

import DI.service.BookService;
import DI.service.impl.BookServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BookService bookService = new BookServiceImpl();
        bookService.save();

    }
}
