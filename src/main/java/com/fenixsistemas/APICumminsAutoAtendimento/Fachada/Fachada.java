package com.fenixsistemas.APICumminsAutoAtendimento.Fachada;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Opcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Produto;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.CategoriaNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.OpcionaisNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.ProdutoNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.VendaNegocio;

@Service
public class Fachada {

	@Autowired
	private VendaNegocio vendaNegocio;
	@Autowired
	private ProdutoNegocio produtoNegocio;
	@Autowired
	private OpcionaisNegocio opcionaisNegorio;
	@Autowired
	private CategoriaNegocio categoriaNegocio;
	
	
	/////////////////VENDA///////////////////////////////////
	public boolean inserirVenda(Venda venda) {
		return vendaNegocio.inserirVenda(venda);
	}
	public int buscarIdCaixa() {
		return vendaNegocio.buscarIdCaixa();
	}
	public int buscarIdProximaVenda() {
		return vendaNegocio.buscarIdProximaVenda();
	}
	
	public int verificarSeAVendaEstaAberta(int idMesaComanda, String tipoVenda) {
		return vendaNegocio.verificarSeAVendaEstaAberta(idMesaComanda, tipoVenda);
	}
	
	public int verificarSeAVendaEstaAguardandoPagamento(int idMesaComanda, String tipoVenda) {
		return vendaNegocio.verificarSeAVendaEstaAguardandoPagamento(idMesaComanda, tipoVenda);
	}
	
	////////////////PRODUTO/////////////////////////////////
	
	public ArrayList<Produto> buscarProdutos(){
		return produtoNegocio.buscarProdutos();
	}
	
	public ArrayList<Produto> buscarProdutosPorCategoria(int idCategoria){
		return produtoNegocio.buscarProdutosPorCategoria(idCategoria);
	}
	
	////////////////OPCIONAL////////////////////////////////
	public ArrayList<Opcional> buscarOpcionaisDeUmProduto(int idProduto){
		return opcionaisNegorio.buscarOpcionaisDeUmProduto(idProduto);
	}
	///////////////CATEGORIA////////////////////////////////
	public ArrayList<Categoria> buscarCategorias(){
		return categoriaNegocio.buscarCategorias();
	}
}

