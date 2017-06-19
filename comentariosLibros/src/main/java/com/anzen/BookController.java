package com.anzen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/comments")
public class BookController {

	   private BookRepository bookRepository;
	
	   @Autowired
	    public BookController(BookRepository bookRepository){
	        this.bookRepository = bookRepository;
	    }
	    
	    
	    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<BookReviews> findAll(){
	        return bookRepository.findAll();
	    }
	    
	    @PostMapping
	    public ResponseEntity save(@RequestBody(required=true)BookReviews book){
	    	bookRepository.save(book);
	    	return new ResponseEntity<>(HttpStatus.CREATED);
	    }
	    
	    @PutMapping("{idBook}")
	    public ResponseEntity update(@RequestBody(required=true)BookReviews book,@PathVariable(value="idbook",required=true)Long idBook){
	    	bookRepository.update(book, idBook);
	    	return new ResponseEntity<Object>(HttpStatus.OK);
	    }
	    
}

