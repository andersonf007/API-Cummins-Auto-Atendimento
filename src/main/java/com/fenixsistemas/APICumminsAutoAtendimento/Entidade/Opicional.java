package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class Opicional {

	private int id;
	private String descricao;
	private double valor;
	private int situacao;
	public Opicional(int id, String descricao, double valor, int situacao) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.situacao = situacao;
	}
	public Opicional() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	
	
}
