package com.livros.estudos.service;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.livros.estudos.entity.Book;

public interface BookService{
    public List<Book> findAll();
    public Book findById(@PathVariable(value="id") long id);
    public Book saveBook(@RequestBody @Validated Book book);
    public void deleteBook(Long id);
    public Book updateBook(Long id, Book book);
}