package com.example.librarymanagement;

import com.example.librarymanagement.Book;

public class BookRepository {
	
    public void save(Book book) {
        System.out.println("Book saved: " + book.getTitle());
    }

}