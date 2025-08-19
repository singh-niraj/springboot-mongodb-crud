package com.mongodb.controller;

import java.util.List;
import java.util.Optional;

import lombok.RequiredArgsConstructor;
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
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;

	@PostMapping("/book")
	public String saveBook(@RequestBody Book book) {
		var savesBook = bookService.saveBook(book);
		return "Book saved successfully with id: " + savesBook.getBookId();
	}

	@GetMapping("/books")
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}

	@GetMapping("/book/{id}")
	public Optional<Book> getBookWithId(@PathVariable int id) {
		return bookService.findBookById(id);
	}

	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBook(id);
		return "book deleted successfully wit id :" + id;
	}

}
