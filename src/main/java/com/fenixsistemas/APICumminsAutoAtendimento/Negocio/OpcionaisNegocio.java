package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Opcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.OpcionaisRepositorio;
@Service
public class OpcionaisNegocio {

	@Autowired
	private OpcionaisRepositorio opcionaisRepositorio;
	
	public ArrayList<Opcional> buscarOpcionaisDeUmProduto(int idProduto){
		return opcionaisRepositorio.buscarOpcionaisDeUmProduto(idProduto);
	}
}
