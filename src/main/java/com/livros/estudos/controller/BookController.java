package com.livros.estudos.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.livros.estudos.entity.Book;
import com.livros.estudos.service.BookService;

@RestController
public class BookController {
    
    private final BookService bookService;

    public BookController(BookService bookService){
        super();
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> listBooks(){
        return bookService.findAll();
    }

    @GetMapping("/")
    public Object home(){
        Map<String, Boolean> response = new HashMap<>();
        response.put("pongs", true);
        return response;
    }
    
    @GetMapping("/book/{id}")
    public Book ListUniqueBook(@PathVariable(value="id") Long id){
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public Book SaveBook(@RequestBody @Validated Book book){
        return bookService.saveBook(book);
    }

    @PutMapping("/book/{id}")
    public Book findBookByIdAndUpdate(@PathVariable(value="id") Long id,
        @RequestBody @Validated Book book){
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable(value="id") Long id){
        bookService.deleteBook(id);
    }
}
