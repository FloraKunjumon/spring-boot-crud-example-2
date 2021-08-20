package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
