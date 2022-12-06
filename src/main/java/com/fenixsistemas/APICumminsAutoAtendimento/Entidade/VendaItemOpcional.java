package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class VendaItemOpcional {

	private int idVenda;
	private int possicaoProdutoVendaItem;
	private int idOpcional;
	private boolean gratis;
	private boolean naoFracionar;
	public VendaItemOpcional(int idVenda, int possicaoProdutoVendaItem, int idOpcional, boolean gratis,
			boolean naoFracionar) {
		super();
		this.idVenda = idVenda;
		this.possicaoProdutoVendaItem = possicaoProdutoVendaItem;
		this.idOpcional = idOpcional;
		this.gratis = gratis;
		this.naoFracionar = naoFracionar;
	}
	public VendaItemOpcional() {
		super();
	}
	public int getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}
	public int getPossicaoProdutoVendaItem() {
		return possicaoProdutoVendaItem;
	}
	public void setPossicaoProdutoVendaItem(int possicaoProdutoVendaItem) {
		this.possicaoProdutoVendaItem = possicaoProdutoVendaItem;
	}
	public int getIdOpcional() {
		return idOpcional;
	}
	public void setIdOpcional(int idOpcional) {
		this.idOpcional = idOpcional;
	}
	public boolean getGratis() {
		return gratis;
	}
	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
	public boolean getNaoFracionar() {
		return naoFracionar;
	}
	public void setNaoFracionar(boolean naoFracionar) {
		this.naoFracionar = naoFracionar;
	}
	
	
}
