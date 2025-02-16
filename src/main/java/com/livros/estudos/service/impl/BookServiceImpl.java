package com.livros.estudos.service.impl;

import com.livros.estudos.entity.Book;
import com.livros.estudos.repository.BookRepository;
import com.livros.estudos.service.BookService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;


    // public BookServiceImpl(BookRepository bookRepository){
    //     super();
    //     this.bookRepository = bookRepository;
    // }

    @Override
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    @Override
    public Book findById(long id){
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book saveBook(@RequestBody @Validated Book book){
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book updatedBook){
        Book existingBook = bookRepository.findById(id).orElse(null);
        if(existingBook != null){
            existingBook.setTitle(updatedBook.getTitle());
            return bookRepository.save(existingBook);
        }else{
            return null;
        }
        
        
    }

    @Override
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
