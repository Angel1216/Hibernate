package com.anzen;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

	
	public  void save(BookReviews book){
		 BookReviews.bookReviews.add(book);
	}
	
	public void update(BookReviews book,Long commentId){
		
		 BookReviews.bookReviews.stream().
		         filter(book1 ->book1.getCommentId()   == commentId).
		         forEach(book1 -> {
		        	 book1.setComments(book.getComments());
				 });
	}
	
	
	
	    public void delete(Long commentId)
	    {
	        BookReviews.bookReviews.removeIf(bookObj -> bookObj.getCommentId()==commentId);
	    }
	    
	    public BookReviews find(Long commentId)
	    {
	        return BookReviews.bookReviews.stream().filter(book ->book.getCommentId()==commentId).
	        findFirst().get();
	    }
	    
	    public List<BookReviews> findAll()
	    {
	        return BookReviews.bookReviews;
	    }

}
