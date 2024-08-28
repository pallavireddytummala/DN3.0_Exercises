package com.example;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void getBookDetails() {
        System.out.println("Fetching book details from the repository:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
