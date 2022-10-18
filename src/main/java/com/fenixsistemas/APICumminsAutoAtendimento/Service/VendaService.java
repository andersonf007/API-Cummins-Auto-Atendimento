package com.fenixsistemas.APICumminsAutoAtendimento.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.VendaRepositorio;

@Service
public class VendaService {

	@Autowired
	private VendaRepositorio vendaRepositorio;
	
	public boolean inserirVenda(Venda venda) {
		return vendaRepositorio.inserirVenda(venda);
	}
	public int buscarIdCaixa() {
		return vendaRepositorio.buscarIdCaixa();
	}
	public int buscarIdProximaVenda() {
		return vendaRepositorio.buscarIdProximaVenda();
	}
}
