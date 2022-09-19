package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class Banco {
	
	private String banco;
	private String porta;
	private String servidor;
	private String senha;
	private String usuario;
	public Banco(String banco, String porta, String servidor, String senha, String usuario) {
		super();
		this.banco = banco;
		this.porta = porta;
		this.servidor = servidor;
		this.senha = senha;
		this.usuario = usuario;
	}
	public Banco() {
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
