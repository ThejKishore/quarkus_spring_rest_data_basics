package com.kish.learning.quarkus;


import com.kish.learning.quarkus.dao.model.Book;
import com.kish.learning.quarkus.service.BookService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookResource {

    private final BookService bookService;

    public BookResource(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> books(){
        List<Book> books = new ArrayList<>();
        this.bookService.getAllBooks().forEach(books::add);
        return books;
    }

    @PostMapping(value = "/save" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save(Book book){
        this.bookService.save(book);
        return ResponseEntity.ok("Success");
    }
}
