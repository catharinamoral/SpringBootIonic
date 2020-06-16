package com.cathariamoral.cursosb.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cathariamoral.cursosb.domain.Categoria;
import com.cathariamoral.cursosb.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
	//ResponseEntity: armazena diversas informações de uma resposta HTTP
	//PathVariable: para que o spring saiba que o id da url vai para o id da variavel
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	

}
