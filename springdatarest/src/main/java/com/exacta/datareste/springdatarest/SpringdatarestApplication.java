package com.exacta.datareste.springdatarest;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exacta.datareste.springdatarest.modelo.Author;
import com.exacta.datareste.springdatarest.modelo.Book;
import com.exacta.datareste.springdatarest.repositorio.AuthorRepository;
import com.exacta.datareste.springdatarest.repositorio.BookRepository;

@SpringBootApplication
public class SpringdatarestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	@PostConstruct
	@Transactional
	public void onLoad() {

		Author alberto = new Author();
		alberto.setName("Alberto");
		authorRepository.save(alberto);

		Book book = new Book();
		book.setTitle("Spring MVC");
		book.setDescription("Domine o principal framework web Java");
		book.setNumOfPages(237);

		book.add(alberto);

		bookRepository.save(book);

	}

}
