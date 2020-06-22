package com.cathariamoral.cursosb.domain;

import javax.persistence.Entity;

import com.cathariamoral.cursosb.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartão extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	public PagamentoComCartão() {}

	public PagamentoComCartão(Integer id, EstadoPagamento estado, Pedido pedido, Integer numerodeParcelas) {
		super(id, estado, pedido);
		this.numeroDeParcelas = numerodeParcelas;
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	
	

}
