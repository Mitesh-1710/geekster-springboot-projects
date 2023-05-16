package com.geekster.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.mapping.model.Book;
import com.geekster.mapping.service.BookService;

@RestController
@RequestMapping("api/v1/mapping")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("book/{id}")
	public Book getBookById(@PathVariable String id) {
		return bookService.getBookById(id);
	}

	@PutMapping("book/{id}")
	public void updateBook(@PathVariable String id, @RequestBody Book book) {

		bookService.updateBook(id, book);
	}

	@DeleteMapping("book/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}
}
