package com.fenixsistemas.APICumminsAutoAtendimento.Fachada;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Opcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Produto;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItem;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItemOpcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.CategoriaNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.OpcionaisNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.ProdutoNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.VendaItemNegocio;
import com.fenixsistemas.APICumminsAutoAtendimento.Negocio.VendaItemOpcionalNegocio;
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
	@Autowired
	private VendaItemNegocio vendaItemNegocio;
	@Autowired
	private VendaItemOpcionalNegocio vendaItemOpcionalNegocio;
	Calendar calendar = Calendar.getInstance();
	
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
		  
		int dia = calendar.get(Calendar.DATE);
		int mes = (calendar.get(Calendar.MONTH) + 1);
		int ano = calendar.get(Calendar.YEAR);
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		listaProdutos = produtoNegocio.buscarProdutosPorCategoria(idCategoria);
		try {
			for(Produto p : listaProdutos) {
				if(p.getHappyHourAtivado()) {
					String horaInicial = p.getHappyHourInicial();
					p.setHappyHourInicial(ano+"-"+mes+"-"+dia+" "+horaInicial);
					String horaFinal = p.getHappyHourFinal();
					p.setHappyHourFinal(ano+"-"+mes+"-"+dia+" "+horaFinal);
					System.out.println(p.getHappyHourInicial());
					System.out.println(p.getHappyHourFinal());
				}
			}
			return listaProdutos;
		}catch(Exception e) {
			return null;
		}
	}
	
	////////////////OPCIONAL////////////////////////////////
	
	public ArrayList<Opcional> buscarOpcionaisDeUmProduto(int idProduto){
		return opcionaisNegorio.buscarOpcionaisDeUmProduto(idProduto);
	}
	
	///////////////CATEGORIA////////////////////////////////
	
	public ArrayList<Categoria> buscarCategorias(){
		return categoriaNegocio.buscarCategorias();
	}
	
	//////////////////VENDA ITEM//////////////////////////
	
	public boolean inserirvendaItem(VendaItem vendaItem) {
		return vendaItemNegocio.inserirvendaItem(vendaItem);
	}
	
	//////////////////VENDA ITEM OPCIONAL //////////////////
	
	public boolean inserirVendaItemOpcional(VendaItemOpcional vendaItemOpcional) {
		return vendaItemOpcionalNegocio.inserirVendaItemOpcional(vendaItemOpcional);
	}
}

