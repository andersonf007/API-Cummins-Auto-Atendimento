package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

import java.util.Date;

public class VendaItem {

	private Long idVenda;
	private int posicaoItem;
	private Long idProduto;
	private double quantidade;
	private double valorUnitario;
	private double valorTotal;
	private String observacao;
	private int situacao;
	private int idImpressora;
	private int idGarcom;
	private double desconto;
	private String tamanho;
	private boolean vendaTamanho;
	private int itemFracionado;
	private double acrescimo;
	private double quantidadeImpressao;
	private String horaLancamento; 
	private boolean gratis;
	public VendaItem(Long idVenda, int posicaoItem, Long idProduto, double quantidade, double valorUnitario,
			double valorTotal, String observacao, int situacao, int idImpressora, int idGarcom, double desconto,
			String tamanho, boolean vendaTamanho, int itemFracionado, double acrescimo, double quantidadeImpressao,
			String horaLancamento, boolean gratis) {
		super();
		this.idVenda = idVenda;
		this.posicaoItem = posicaoItem;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
		this.observacao = observacao;
		this.situacao = situacao;
		this.idImpressora = idImpressora;
		this.idGarcom = idGarcom;
		this.desconto = desconto;
		this.tamanho = tamanho;
		this.vendaTamanho = vendaTamanho;
		this.itemFracionado = itemFracionado;
		this.acrescimo = acrescimo;
		this.quantidadeImpressao = quantidadeImpressao;
		this.horaLancamento = horaLancamento;
		this.gratis = gratis;
	}
	public VendaItem() {
		super();
	}
	public Long getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Long idVenda) {
		this.idVenda = idVenda;
	}
	public int getPosicaoItem() {
		return posicaoItem;
	}
	public void setPosicaoItem(int posicaoItem) {
		this.posicaoItem = posicaoItem;
	}
	public Long getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getIdImpressora() {
		return idImpressora;
	}
	public void setIdImpressora(int idImpressora) {
		this.idImpressora = idImpressora;
	}
	public int getIdGarcom() {
		return idGarcom;
	}
	public void setIdGarcom(int idGarcom) {
		this.idGarcom = idGarcom;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public boolean getVendaTamanho() {
		return vendaTamanho;
	}
	public void setVendaTamanho(boolean vendaTamanho) {
		this.vendaTamanho = vendaTamanho;
	}
	public int getItemFracionado() {
		return itemFracionado;
	}
	public void setItemFracionado(int itemFracionado) {
		this.itemFracionado = itemFracionado;
	}
	public double getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	public double getQuantidadeImpressao() {
		return quantidadeImpressao;
	}
	public void setQuantidadeImpressao(double quantidadeImpressao) {
		this.quantidadeImpressao = quantidadeImpressao;
	}
	public String getHoraLancamento() {
		return horaLancamento;
	}
	public void setHoraLancamento(String horaLancamento) {
		this.horaLancamento = horaLancamento;
	}
	public boolean getGratis() {
		return gratis;
	}
	public void setGratis(boolean gratis) {
		this.gratis = gratis;
	}
	
	
}
