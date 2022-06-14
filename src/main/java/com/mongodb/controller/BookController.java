package com.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.entity.Book;
import com.mongodb.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/savebook")
	public String saveBook(@RequestBody Book book) {
		bookService.saveBook(book);
		return "Book saved successfully with id: " + book.getBookId();
	}

	@GetMapping("/getallbook")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@GetMapping("/getbookbyid/{id}")
	public Optional<Book> getBookWithId(@PathVariable int id) {
		return bookService.findBookById(id);
	}

	@DeleteMapping("/deletebookbyid/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "book deleted successfully wit id :" + id;
	}

}
