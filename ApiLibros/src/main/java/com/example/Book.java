package com.example;

import java.util.ArrayList;
import java.util.List;

public class Book {
	
	
	public static  long  contadorLibros=1;
	public static  final List<Book> book = new ArrayList<>();
	
	
	private Long bookId;
	private String title;
	private String author;
	private String isbn;  
	private Integer pages;
	
	
	public Book() {
	
		 this.bookId= Book.contadorLibros++;
	}
	
	
	public Book(Long bookId, String title, String author, String isbn, Integer pages) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.pages = pages;
	}
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	
}
