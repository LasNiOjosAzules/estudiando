package com.bookshelf.repositories;

import com.bookshelf.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository <Book, Integer> {

    List <Book> findAllByAuthor(String author);
    List <Book> findAllByNameContainingIgnoreCase(String name);
    List <Book> findAllByYearPublish(int yearPublish);
    List <Book> findAllByYearPublishBetween(int year1, int year2);
}
