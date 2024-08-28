package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.LibraryService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LibraryService libraryService = context.getBean(LibraryService.class);

        // Call methods on libraryService to test logging
        libraryService.someMethod();
    }
}
