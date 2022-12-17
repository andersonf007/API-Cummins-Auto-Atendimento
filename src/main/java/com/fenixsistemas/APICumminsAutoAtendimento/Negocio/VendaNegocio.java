package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.VendaRepositorio;

@Service
public class VendaNegocio {

	@Autowired
	private VendaRepositorio vendaRepositorio;
	
	public boolean atualizaVenda(Venda venda) {
		return vendaRepositorio.atualizaVenda(venda);
	}
	public int abrirVenda(Venda venda) {
		return vendaRepositorio.abrirVenda(venda);
	}
	public int buscarIdCaixa() {
		return vendaRepositorio.buscarIdCaixa();
	}
	public int buscarIdProximaVenda() {
		return vendaRepositorio.buscarIdProximaVenda();
	}
	public int verificarSeAVendaEstaAberta(int idMesaComanda, String tipoVenda) {
		return vendaRepositorio.verificarSeAVendaEstaAberta(idMesaComanda, tipoVenda);
	}
	
	public int verificarSeAVendaEstaAguardandoPagamento(int idMesaComanda, String tipoVenda) {
		return vendaRepositorio.verificarSeAVendaEstaAguardandoPagamento(idMesaComanda, tipoVenda);
	}
	
}


