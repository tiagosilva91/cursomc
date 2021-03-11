package com.tiago.cursomc.servicies;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiago.cursomc.domain.Categoria;
import com.tiago.cursomc.repositories.CategoriaRepositore;

@Service
public class CategoriaService {
	
	@Autowired //Quer dizer que será automaticamente instanciada pelo Spring utilizando injeção de dependencia ou inversão de controle
	private CategoriaRepositore repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
