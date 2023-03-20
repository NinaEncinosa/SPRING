package com.example.obrestdatajpa.controllers;

import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repositories.BookRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/api/books/{id}")
    public ResponseEntity<Book> findByID(@PathVariable Long id){
        Optional<Book> book = bookRepository.findById(id);
        //En caso de no encontrar el libro, deberia devolver "404 not found"
        if(!book.isEmpty()){
            return ResponseEntity.ok(book.get());
        }
        return ResponseEntity.notFound().build();
    }
    //Crear un nuevo libro en BBDD
    @PostMapping("/api/books")
    public Book create (@RequestBody Book book){
        return  bookRepository.save(book);
    }

    //Actualizar un libro en BBDD

    //Borrar un libro por Id en BBDD

}
