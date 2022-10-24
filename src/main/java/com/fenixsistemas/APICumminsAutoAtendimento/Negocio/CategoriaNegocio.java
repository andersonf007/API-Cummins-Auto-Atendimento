package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.CategoriaRepositorio;

@Service
public class CategoriaNegocio {

	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	public ArrayList<Categoria> buscarCategorias(){
		return categoriaRepositorio.buscarCategorias();
	}
}
