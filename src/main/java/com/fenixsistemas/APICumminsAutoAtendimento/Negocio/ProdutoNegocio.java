package com.fenixsistemas.APICumminsAutoAtendimento.Negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Produto;
import com.fenixsistemas.APICumminsAutoAtendimento.Repositorio.ProdutoRepositorio;

public class ProdutoNegocio {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	public ArrayList<Produto> buscarProdutos(){
		return produtoRepositorio.buscarProdutos();
	}
	
	public ArrayList<Produto> buscarProdutosPorCategoria(int idCategoria){
		return produtoRepositorio.buscarProdutosPorCategoria(idCategoria);
	}
}
