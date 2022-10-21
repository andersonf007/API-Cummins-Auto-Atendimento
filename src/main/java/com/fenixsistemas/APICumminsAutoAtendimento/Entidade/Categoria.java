package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class Categoria {
	
	private int id;
	private String descricao;
	private boolean fracionar;
	private int quantidadeFracionamento;
	public Categoria(int id, String descricao, boolean fracionar, int quantidadeFracionamento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fracionar = fracionar;
		this.quantidadeFracionamento = quantidadeFracionamento;
	}
	public Categoria() {
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
	public boolean getFracionar() {
		return fracionar;
	}
	public void setFracionar(boolean fracionar) {
		this.fracionar = fracionar;
	}
	public int getQuantidadeFracionamento() {
		return quantidadeFracionamento;
	}
	public void setQuantidadeFracionamento(int quantidadeFracionamento) {
		this.quantidadeFracionamento = quantidadeFracionamento;
	}
	
	

}
