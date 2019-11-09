package com.kish.learning.quarkus.service;


import com.kish.learning.quarkus.dao.logic.BookRepository;
import com.kish.learning.quarkus.dao.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> getAllBooks(){
        return this.bookRepository.findAll();
    }

    public void save(Book book){
        bookRepository.save(book);
    }
}
