package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class Venda {

	private int id;
	private String dataAbertura;
	//private int idCliente;
	private int situacao;
	private int usuarioAbertura;
	private String dataAbertura2;
	private double desconto;
	private double acrescimo;
	private double valorTotal;
	private String tipoVenda;
	private int numeroMesa;
	private int numeroComanda;
	private int idDaVenda;
	private int idCaixa;
	private String terminalAbertura;
	public Venda(int id, String dataAbertura, int situacao, int usuarioAbertura, String dataAbertura2, double desconto,
			double acrescimo, double valorTotal, String tipoVenda, int numeroMesa, int numeroComanda, int idDaVenda,
			int idCaixa, String terminalAbertura) {
		super();
		this.id = id;
		this.dataAbertura = dataAbertura;
		this.situacao = situacao;
		this.usuarioAbertura = usuarioAbertura;
		this.dataAbertura2 = dataAbertura2;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
		this.valorTotal = valorTotal;
		this.tipoVenda = tipoVenda;
		this.numeroMesa = numeroMesa;
		this.numeroComanda = numeroComanda;
		this.idDaVenda = idDaVenda;
		this.idCaixa = idCaixa;
		this.terminalAbertura = terminalAbertura;
	}
	public Venda() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getUsuarioAbertura() {
		return usuarioAbertura;
	}
	public void setUsuarioAbertura(int usuarioAbertura) {
		this.usuarioAbertura = usuarioAbertura;
	}
	public String getDataAbertura2() {
		return dataAbertura2;
	}
	public void setDataAbertura2(String dataAbertura2) {
		this.dataAbertura2 = dataAbertura2;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipoVenda() {
		return tipoVenda;
	}
	public void setTipoVenda(String tipoVenda) {
		this.tipoVenda = tipoVenda;
	}
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public int getNumeroComanda() {
		return numeroComanda;
	}
	public void setNumeroComanda(int numeroComanda) {
		this.numeroComanda = numeroComanda;
	}
	public int getIdDaVenda() {
		return idDaVenda;
	}
	public void setIdDaVenda(int idDaVenda) {
		this.idDaVenda = idDaVenda;
	}
	public int getIdCaixa() {
		return idCaixa;
	}
	public void setIdCaixa(int idCaixa) {
		this.idCaixa = idCaixa;
	}
	public String getTerminalAbertura() {
		return terminalAbertura;
	}
	public void setTerminalAbertura(String terminalAbertura) {
		this.terminalAbertura = terminalAbertura;
	}
	
	
}
