package com.cathariamoral.cursosb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cathariamoral.cursosb.domain.Categoria;
import com.cathariamoral.cursosb.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //a dependencia é automaticamente instanciada
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id){
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
