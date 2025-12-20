package com.revature.library;

import com.revature.library.model.Book;
import com.revature.library.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSeeder {

    @Bean
    public CommandLineRunner initDatabase(BookRepository bookRepository) {
        return args -> {
            bookRepository.save(new Book("Clean Code", "Robert Martin", "978-0132350884"));
            bookRepository.save(new Book("The Pragmatic Programmer", "David Thomas", "978-0201616224"));
            bookRepository.save(new Book("Design Patterns", "Gang of Four", "978-0201633610"));
            bookRepository.save(new Book("Effective Java", "Joshua Bloch", "978-0134686097"));
            bookRepository.save(new Book("Spring in Action", "Craig Walls", "978-1617294945"));
        };
    }
}