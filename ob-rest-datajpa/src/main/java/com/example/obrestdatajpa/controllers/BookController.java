package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //CRUD sobre la entidad Book
    //Buscar todos los libros en BBDD (lista de libros)
    @GetMapping("/api/books")
    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    //Bucar un libro por Id en BBDD
    public Book findByID(Long id){
        return null;
    }
    //Crear un nuevo libro en BBDD


    //Actualizar un libro en BBDD

    //Borrar un libro por Id en BBDD


}
