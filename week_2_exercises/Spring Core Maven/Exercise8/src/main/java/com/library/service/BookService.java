package com.library.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public void addBook(String bookName) {
        System.out.println("BookService.addBook() : Adding book " + bookName);
    }
}
