package com.bookshelf.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue
    public int id;
    public String name;
    public String author;
    public String letter;
    public String category;
    public String location;
    public String saga;
    public int numPages;
    public int yearRead;
    public int yearPublish;
}

