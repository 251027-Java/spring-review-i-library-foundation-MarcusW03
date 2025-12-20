package com.revature.library.repository;

import com.revature.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {

    public Book findByAuthorContaining(String author);
}