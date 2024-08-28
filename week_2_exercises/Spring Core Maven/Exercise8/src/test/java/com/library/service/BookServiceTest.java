package com.library.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BookServiceTest {

    @Autowired
    private ApplicationContext context;

    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = context.getBean(BookService.class);
    }

    @Test
    public void testAddBook() {
        assertNotNull(bookService, "The bookService should not be null");
        bookService.addBook("Testinggg");
    }
}
