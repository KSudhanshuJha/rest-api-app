package com.book.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.exception.ResourceNotFoundException;
import com.book.repository.BookRepository;
import com.book.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> getBooksById(Long id) throws ResourceNotFoundException {
		return Optional.of(bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not found for this id :: " + id)));
	}

	@Override
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
	}

	@Override
	public void delete(Long id) throws ResourceNotFoundException {
		Book book = bookRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Book not found for this id :: " + id));
		bookRepository.delete(book);
	}

	@Override
	public void update(Book book, Long bookid) throws ResourceNotFoundException {
		Optional<Book> bookExit = Optional.of(bookRepository.findById(bookid)
				.orElseThrow(() -> new ResourceNotFoundException("Book not found for this id :: " + bookid)));
		Book books = bookExit.get();
		books.setBookname(book.getBookname());
		books.setAuthor(book.getAuthor());
		books.setPrice(book.getPrice());
	    bookRepository.save(books);		
	}

}
