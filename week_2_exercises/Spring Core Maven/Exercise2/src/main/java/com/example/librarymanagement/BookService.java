package com.example.librarymanagement;

import com.example.librarymanagement.Book;
import com.example.librarymanagement.BookRepository;

public class BookService {
	
    private BookRepository bookRepository;
 public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

   
    public void addBook(Book book) {
        bookRepository.save(book);
    }

}

