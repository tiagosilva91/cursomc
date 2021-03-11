package com.tiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tiago.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepositore extends JpaRepository<Categoria, Integer> {
	
	

}
