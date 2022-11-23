package com.book.service;

import java.util.List;
import java.util.Optional;

import com.book.entity.Book;
import com.book.exception.ResourceNotFoundException;

public interface BookService {

	public List<Book> getAllBooks();

	public Optional<Book> getBooksById(Long id) throws ResourceNotFoundException;

	public void saveOrUpdate(Book book);

	public void delete(Long id) throws ResourceNotFoundException;

	public void update(Book book, Long bookid) throws ResourceNotFoundException;

}
