package com.example;

import java.io.IOException;
import java.util.Arrays;
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

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("api/books")
public class BookController {

	   private BookRepository bookRepository;
	
	   @Autowired
	    public BookController(BookRepository bookRepository){
	        this.bookRepository = bookRepository;
	    }
	    
	    
	    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public List<Book> findAll(){
	        return bookRepository.findAll();
	    }
	    
	    @PostMapping
	    public ResponseEntity save(@RequestBody(required=true)Book book){
	    	bookRepository.save(book);
	    	return new ResponseEntity<>(HttpStatus.CREATED);
	    }
	    
	    @PutMapping("{idBook}")
	    public ResponseEntity update(@RequestBody(required=true)Book book,@PathVariable(value="idbook",required=true)Long idBook){
	    	bookRepository.update(book, idBook);
	    	return new ResponseEntity<Object>(HttpStatus.OK);
	    }
	    
	    public static int cont = 1;
	    
	    @HystrixCommand(fallbackMethod = "fallback")
	    @GetMapping("{idBook}")
	    public ResponseEntity find(@PathVariable(value="{idBook}",required=true)long idBook) throws IOException{
	    	
	    	if(cont++>4){
	    		throw new IOException("exception");
	    	}
	    	return new ResponseEntity(bookRepository.find(idBook),HttpStatus.OK);
	    }
	    
	    public ResponseEntity fallback(Long idBook){
	    	Book book = new Book();
	    	book.setBookId(idBook);
	    	return new ResponseEntity<>(Arrays.asList(book), HttpStatus.OK);
	    }
	    
}

