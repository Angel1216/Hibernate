package com.anzen.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.anzen.dao.BookOwnHibernateRepository;
import com.anzen.bean.Book;

@Service
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookOwnHibernateRepository bookOwnHibernateRepository;
	
	

	// BookOwnHibernateRepository
	@Override
	public List<Book> getAllBooks() {
		return bookOwnHibernateRepository.getAllBooks();
	}

	@Override
	public List<Book> getBook(long id) {
		return bookOwnHibernateRepository.getBook(id);
	}

}