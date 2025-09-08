package com.GYY_GIS;

import com.GYY_GIS.service.BookService;
import com.GYY_GIS.service.impl.BookServiceImpl;

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
