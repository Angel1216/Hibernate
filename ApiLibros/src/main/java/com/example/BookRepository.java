package com.example;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

	
	public  void save(Book book){
		 Book.book.add(book);
	}
	
	public void update(Book book,Long idBook){
		
		 Book.book.stream().
		         filter(book1 ->book1.getBookId()   == idBook).
		         forEach(book1 -> {
					 book1.setAuthor(book.getAuthor());
					 book1.setIsbn(book.getIsbn());
					 book1.setPages(book.getPages());
					 book1.setTitle(book.getTitle());
				 });
	}
	
	
	
	    public void delete(Long idBook)
	    {
	        Book.book.removeIf(bookObj -> bookObj.getBookId()==idBook);
	    }
	    
	    public Book find(Long idBook)
	    {
	        return Book.book.stream().filter(book ->book.getBookId()==idBook).
	        findFirst().get();
	    }
	    
	    public List<Book> findAll()
	    {
	        return Book.book;
	    }

}
