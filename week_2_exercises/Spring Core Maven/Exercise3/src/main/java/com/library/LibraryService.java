package com.library;

public class LibraryService {
    public void someMethod() {
        // Simulate some work
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
