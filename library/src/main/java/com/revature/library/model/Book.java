package com.revature.library.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Book Entity - TODO: Complete the annotations
 */
@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(unique = true)
    private String isbn;

    private boolean available = true;

    private LocalDateTime createdAt;

    // Default constructor required by JPA
    public Book() {
        this.createdAt = LocalDateTime.now();
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.createdAt = LocalDateTime.now();
    }

    // TODO: Generate getters and setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add remaining getters/setters...
}
