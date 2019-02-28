package com.exacta.datareste.springdatarest.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.exacta.datareste.springdatarest.modelo.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{
	
	@RestResource(path="byName", rel = "customFindMethod")
	Author findByName(@Param("name") String name);

}
