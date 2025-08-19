package com.mongodb.service;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.mongodb.entity.Book;
import com.mongodb.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;
	
	public Book saveBook(Book book) {
	  return bookRepository.save(book);
		
	}
	
	public List<Book> getAllBook(){
		return bookRepository.findAll();
	}
	
	public Optional<Book> findBookById(int id){
		return bookRepository.findById(id);
	}
	
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}

}
