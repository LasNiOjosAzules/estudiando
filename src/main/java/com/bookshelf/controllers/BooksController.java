package com.bookshelf.controllers;

import com.bookshelf.models.Book;
import com.bookshelf.repositories.BooksRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController

public class BooksController {
    BooksRepository booksRepository;
    public BooksController(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }
    @GetMapping("/api/books")
    public List<Book> getBooks(){
        return booksRepository.findAll();

    }
    @GetMapping("/api/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return booksRepository.findById(id).orElseGet(()->null);
    }
}
