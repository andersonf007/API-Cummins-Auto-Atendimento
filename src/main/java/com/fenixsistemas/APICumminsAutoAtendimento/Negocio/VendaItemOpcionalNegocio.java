package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItemOpcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.VendaItemOpcionalRepositorio;

@Service
public class VendaItemOpcionalNegocio {
	@Autowired
	private VendaItemOpcionalRepositorio vendaItemOpcionalRepositorio;
	
	public boolean inserirVendaItemOpcional(VendaItemOpcional vendaItemOpcional) {
		return vendaItemOpcionalRepositorio.inserirVendaItemOpcional(vendaItemOpcional);
	}
}
