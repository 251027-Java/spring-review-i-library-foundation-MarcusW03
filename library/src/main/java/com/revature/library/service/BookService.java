package com.revature.library.service;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * BookService - TODO: Implement using constructor injection
 */
@Service
public class BookService {

    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public Book checkoutBook(Long bookId) {
        Book book = findById(bookId);
        book.setAvailable(false);
        return bookRepository.save(book);
    }

    public Book returnBook(Long bookId) {
        Book book = findById(bookId);
        book.setAvailable(true);
        return bookRepository.save(book);
    }
}
