package com.livros.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.livros.estudos.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
