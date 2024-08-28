package  com.example.library;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Other methods
    public void performService() {
        // Use bookRepository to perform some action
        bookRepository.doSomething();
    }
}
