package com.example;

import java.util.Scanner;

public class BookService {
    private BookRepository bookRepository;

    // Constructor Injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBookDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String bookTitle = scanner.nextLine();
        bookRepository.addBook(bookTitle);
    }

    public void displayBookDetails() {
        bookRepository.getBookDetails();
    }
}
