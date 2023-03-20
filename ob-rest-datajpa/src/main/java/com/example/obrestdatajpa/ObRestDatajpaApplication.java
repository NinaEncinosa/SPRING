package com.example.obrestdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDatajpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);
		System.out.println(repository.count());
		Book book1 = new Book(null,"titulito","Nina",150,27.5, LocalDate.of(2023,3,25),true);
		Book book2 = new Book(null,"otro libro","Enci",270,29.5, LocalDate.of(2020,3,25),false);
		repository.save(book1);
		repository.save(book2);

		System.out.println("Cantidad de libros: " + repository.count());

		repository.deleteById(1L);
		System.out.println("Cantidad de libros luego de borrar 1: " + repository.count());


	}

}
