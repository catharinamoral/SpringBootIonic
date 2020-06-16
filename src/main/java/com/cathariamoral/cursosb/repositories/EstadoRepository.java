package com.cathariamoral.cursosb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cathariamoral.cursosb.domain.Estado;

@Repository
//os parametros são o objeto e o tipo do atributo identificador 
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

	
	
}
