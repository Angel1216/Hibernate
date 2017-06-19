package com.anzen.service;

import com.anzen.bean.Book;
import java.util.List;


public interface BookService {
	
	// BookOwnHibernateRepository
	public List<Book> getAllBooks();
	public List<Book> getBook(long id);
	
}
