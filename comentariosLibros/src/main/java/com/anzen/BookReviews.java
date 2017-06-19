package com.anzen;

import java.util.ArrayList;
import java.util.List;

public class BookReviews {
	
	
	public static  long  contadorLibros=1;
	public static  final List<BookReviews> bookReviews = new ArrayList<>();
	
	
	private Long bookId;
	private Long commentId;
	private String comments;
	
	public BookReviews() {
	
		 this.commentId= BookReviews.contadorLibros++;
	}
	
	
	public BookReviews(Long bookId, String comments, Long commentId) {
		super();
		this.bookId = bookId;
		this.commentId = commentId;
		this.comments = comments;
	}
	
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public Long getCommentId() {
		return commentId;
	}


	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	
	
}
