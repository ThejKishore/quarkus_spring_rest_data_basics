package com.kish.learning.quarkus.dao.logic;

import com.kish.learning.quarkus.dao.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
