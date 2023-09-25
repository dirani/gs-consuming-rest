package com.example.consumingrest;

import jakarta.persistence.*;

@Entity
public class QuoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private String author;

    // Getters and setters
}
