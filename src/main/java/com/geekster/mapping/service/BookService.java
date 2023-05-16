package com.geekster.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.mapping.model.Book;
import com.geekster.mapping.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book createBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book getBookById(String id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		Book book = null;
		if (optionalBook.isPresent()) {
			book = optionalBook.get();
		}
		return book;
	}

	public Book updateBook(String id, Book newBook) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		Book book = null;
		if (optionalBook.isPresent()) {
			book = optionalBook.get();
			book.setTitle(newBook.getTitle());
			book.setAuthor(newBook.getAuthor());
			book.setDescription(newBook.getDescription());
			book.setPrice(newBook.getPrice());
			book.setStudent(newBook.getStudent());
			bookRepository.save(book);
		}
		return book;
	}

	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}
}
