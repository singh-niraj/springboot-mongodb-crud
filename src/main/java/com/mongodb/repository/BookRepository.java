package com.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}
