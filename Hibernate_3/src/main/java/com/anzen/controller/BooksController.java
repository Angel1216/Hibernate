package com.anzen.controller;

import org.springframework.web.bind.annotation.RestController;
import com.anzen.bean.Book;
import com.anzen.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
public class BooksController {

	// Inyeccion de dependencias del servicio
	@Autowired
	private BookService bookService;

	// BookOwnHibernateRepository
	@RequestMapping(value = "/Hibernate")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping(value = "/Hibernate/manual/{id}")
	public List<Book> getBook(@PathVariable long id) {
		return bookService.getBook(id);
	}
	
}
