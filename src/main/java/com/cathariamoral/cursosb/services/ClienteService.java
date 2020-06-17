package com.cathariamoral.cursosb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cathariamoral.cursosb.domain.Cliente;
import com.cathariamoral.cursosb.repositories.ClienteRepository;
import com.cathariamoral.cursosb.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired //a dependencia é automaticamente instanciada
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id){
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}

}
