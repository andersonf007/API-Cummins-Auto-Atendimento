package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItem;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.VendaItemRepositorio;

@Service
public class VendaItemNegocio {
	@Autowired
	private VendaItemRepositorio vendaItemRepositorio;
	
	public boolean inserirvendaItem(VendaItem vendaItem) {
		return vendaItemRepositorio.inserirvendaItem(vendaItem);
	}
}
