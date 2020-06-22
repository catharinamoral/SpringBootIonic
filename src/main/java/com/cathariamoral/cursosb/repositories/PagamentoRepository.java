package com.cathariamoral.cursosb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cathariamoral.cursosb.domain.Categoria;
import com.cathariamoral.cursosb.domain.Pagamento;
import com.cathariamoral.cursosb.domain.Pedido;

@Repository
//os parametros são o objeto e o tipo do atributo identificador 
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{


}
