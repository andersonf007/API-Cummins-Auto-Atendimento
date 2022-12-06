package com.fenixsistemas.APICumminsAutoAtendimento.Entidade;

public class Produto {
	
	private int id;
	private String descricao;
	private int id_unidade;
	private String unidade;
	private double precoVenda;
	private int situacao;
	private int id_categoria;
	private String categoria;
	private double valorP;
	private double valorM;
	private double valorG;
	private double valorGG;
	private double valorE;
	private boolean vendaTamanho;
	private String tamanhoPadrao;
	private boolean happyHourAtivado;
	private boolean happyHourSegunda;
	private boolean happyHourTerca;
	private boolean happyHourQuarta;
	private boolean happyHourQuinta;
	private boolean happyHourSexta;
	private boolean happyHourSabado;
	private boolean happyHourDomingo;
	private boolean happyHourMesa;
	private boolean happyHourComanda;
	private String happyHourInicial;
	private String happyHourFinal;
	private double happyHourValor;
	private boolean proximoGratis;
	private int quantidadeProximoGratis;
	private boolean segundaGratis;
	private boolean tercaGratis;
	private boolean quartaGratis;
	private boolean quintaGratis;
	private boolean sextaGratis;
	private boolean sabadoGratis;
	private boolean domingoGratis;
	private String horaInicialGratis;
	private String horaFinalGratis;
	private boolean restricao;
	private boolean naoSegunda;
	private boolean naoTerca;
	private boolean naoQuarta;
	private boolean naoQuinta;
	private boolean naoSexta;
	private boolean naoSabado;
	private boolean naoDomingo;
	private String urlImagem;
	public Produto(int id, String descricao, int id_unidade, String unidade, double precoVenda, int situacao,
			int id_categoria, String categoria, double valorP, double valorM, double valorG, double valorGG,
			double valorE, boolean vendaTamanho, String tamanhoPadrao, boolean happyHourAtivado,
			boolean happyHourSegunda, boolean happyHourTerca, boolean happyHourQuarta, boolean happyHourQuinta,
			boolean happyHourSexta, boolean happyHourSabado, boolean happyHourDomingo, boolean happyHourMesa,
			boolean happyHourComanda, String happyHourInicial, String happyHourFinal, double happyHourValor,
			boolean proximoGratis, int quantidadeProximoGratis, boolean segundaGratis, boolean tercaGratis,
			boolean quartaGratis, boolean quintaGratis, boolean sextaGratis, boolean sabadoGratis,
			boolean domingoGratis, String horaInicialGratis, String horaFinalGratis, boolean restricao,
			boolean naoSegunda, boolean naoTerca, boolean naoQuarta, boolean naoQuinta, boolean naoSexta,
			boolean naoSabado, boolean naoDomingo, String urlImagem) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.id_unidade = id_unidade;
		this.unidade = unidade;
		this.precoVenda = precoVenda;
		this.situacao = situacao;
		this.id_categoria = id_categoria;
		this.categoria = categoria;
		this.valorP = valorP;
		this.valorM = valorM;
		this.valorG = valorG;
		this.valorGG = valorGG;
		this.valorE = valorE;
		this.vendaTamanho = vendaTamanho;
		this.tamanhoPadrao = tamanhoPadrao;
		this.happyHourAtivado = happyHourAtivado;
		this.happyHourSegunda = happyHourSegunda;
		this.happyHourTerca = happyHourTerca;
		this.happyHourQuarta = happyHourQuarta;
		this.happyHourQuinta = happyHourQuinta;
		this.happyHourSexta = happyHourSexta;
		this.happyHourSabado = happyHourSabado;
		this.happyHourDomingo = happyHourDomingo;
		this.happyHourMesa = happyHourMesa;
		this.happyHourComanda = happyHourComanda;
		this.happyHourInicial = happyHourInicial;
		this.happyHourFinal = happyHourFinal;
		this.happyHourValor = happyHourValor;
		this.proximoGratis = proximoGratis;
		this.quantidadeProximoGratis = quantidadeProximoGratis;
		this.segundaGratis = segundaGratis;
		this.tercaGratis = tercaGratis;
		this.quartaGratis = quartaGratis;
		this.quintaGratis = quintaGratis;
		this.sextaGratis = sextaGratis;
		this.sabadoGratis = sabadoGratis;
		this.domingoGratis = domingoGratis;
		this.horaInicialGratis = horaInicialGratis;
		this.horaFinalGratis = horaFinalGratis;
		this.restricao = restricao;
		this.naoSegunda = naoSegunda;
		this.naoTerca = naoTerca;
		this.naoQuarta = naoQuarta;
		this.naoQuinta = naoQuinta;
		this.naoSexta = naoSexta;
		this.naoSabado = naoSabado;
		this.naoDomingo = naoDomingo;
		this.urlImagem = urlImagem;
	}
	public Produto() {
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
	public int getId_unidade() {
		return id_unidade;
	}
	public void setId_unidade(int id_unidade) {
		this.id_unidade = id_unidade;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getValorP() {
		return valorP;
	}
	public void setValorP(double valorP) {
		this.valorP = valorP;
	}
	public double getValorM() {
		return valorM;
	}
	public void setValorM(double valorM) {
		this.valorM = valorM;
	}
	public double getValorG() {
		return valorG;
	}
	public void setValorG(double valorG) {
		this.valorG = valorG;
	}
	public double getValorGG() {
		return valorGG;
	}
	public void setValorGG(double valorGG) {
		this.valorGG = valorGG;
	}
	public double getValorE() {
		return valorE;
	}
	public void setValorE(double valorE) {
		this.valorE = valorE;
	}
	public boolean getVendaTamanho() {
		return vendaTamanho;
	}
	public void setVendaTamanho(boolean vendaTamanho) {
		this.vendaTamanho = vendaTamanho;
	}
	public String getTamanhoPadrao() {
		return tamanhoPadrao;
	}
	public void setTamanhoPadrao(String tamanhoPadrao) {
		this.tamanhoPadrao = tamanhoPadrao;
	}
	public boolean getHappyHourAtivado() {
		return happyHourAtivado;
	}
	public void setHappyHourAtivado(boolean happyHourAtivado) {
		this.happyHourAtivado = happyHourAtivado;
	}
	public boolean getHappyHourSegunda() {
		return happyHourSegunda;
	}
	public void setHappyHourSegunda(boolean happyHourSegunda) {
		this.happyHourSegunda = happyHourSegunda;
	}
	public boolean getHappyHourTerca() {
		return happyHourTerca;
	}
	public void setHappyHourTerca(boolean happyHourTerca) {
		this.happyHourTerca = happyHourTerca;
	}
	public boolean getHappyHourQuarta() {
		return happyHourQuarta;
	}
	public void setHappyHourQuarta(boolean happyHourQuarta) {
		this.happyHourQuarta = happyHourQuarta;
	}
	public boolean getHappyHourQuinta() {
		return happyHourQuinta;
	}
	public void setHappyHourQuinta(boolean happyHourQuinta) {
		this.happyHourQuinta = happyHourQuinta;
	}
	public boolean getHappyHourSexta() {
		return happyHourSexta;
	}
	public void setHappyHourSexta(boolean happyHourSexta) {
		this.happyHourSexta = happyHourSexta;
	}
	public boolean getHappyHourSabado() {
		return happyHourSabado;
	}
	public void setHappyHourSabado(boolean happyHourSabado) {
		this.happyHourSabado = happyHourSabado;
	}
	public boolean getHappyHourDomingo() {
		return happyHourDomingo;
	}
	public void setHappyHourDomingo(boolean happyHourDomingo) {
		this.happyHourDomingo = happyHourDomingo;
	}
	public boolean getHappyHourMesa() {
		return happyHourMesa;
	}
	public void setHappyHourMesa(boolean happyHourMesa) {
		this.happyHourMesa = happyHourMesa;
	}
	public boolean getHappyHourComanda() {
		return happyHourComanda;
	}
	public void setHappyHourComanda(boolean happyHourComanda) {
		this.happyHourComanda = happyHourComanda;
	}
	public String getHappyHourInicial() {
		return happyHourInicial;
	}
	public void setHappyHourInicial(String happyHourInicial) {
		this.happyHourInicial = happyHourInicial;
	}
	public String getHappyHourFinal() {
		return happyHourFinal;
	}
	public void setHappyHourFinal(String happyHourFinal) {
		this.happyHourFinal = happyHourFinal;
	}
	public double getHappyHourValor() {
		return happyHourValor;
	}
	public void setHappyHourValor(double happyHourValor) {
		this.happyHourValor = happyHourValor;
	}
	public boolean getProximoGratis() {
		return proximoGratis;
	}
	public void setProximoGratis(boolean proximoGratis) {
		this.proximoGratis = proximoGratis;
	}
	public int getQuantidadeProximoGratis() {
		return quantidadeProximoGratis;
	}
	public void setQuantidadeProximoGratis(int quantidadeProximoGratis) {
		this.quantidadeProximoGratis = quantidadeProximoGratis;
	}
	public boolean getSegundaGratis() {
		return segundaGratis;
	}
	public void setSegundaGratis(boolean segundaGratis) {
		this.segundaGratis = segundaGratis;
	}
	public boolean getTercaGratis() {
		return tercaGratis;
	}
	public void setTercaGratis(boolean tercaGratis) {
		this.tercaGratis = tercaGratis;
	}
	public boolean getQuartaGratis() {
		return quartaGratis;
	}
	public void setQuartaGratis(boolean quartaGratis) {
		this.quartaGratis = quartaGratis;
	}
	public boolean getQuintaGratis() {
		return quintaGratis;
	}
	public void setQuintaGratis(boolean quintaGratis) {
		this.quintaGratis = quintaGratis;
	}
	public boolean getSextaGratis() {
		return sextaGratis;
	}
	public void setSextaGratis(boolean sextaGratis) {
		this.sextaGratis = sextaGratis;
	}
	public boolean getSabadoGratis() {
		return sabadoGratis;
	}
	public void setSabadoGratis(boolean sabadoGratis) {
		this.sabadoGratis = sabadoGratis;
	}
	public boolean getDomingoGratis() {
		return domingoGratis;
	}
	public void setDomingoGratis(boolean domingoGratis) {
		this.domingoGratis = domingoGratis;
	}
	public String getHoraInicialGratis() {
		return horaInicialGratis;
	}
	public void setHoraInicialGratis(String horaInicialGratis) {
		this.horaInicialGratis = horaInicialGratis;
	}
	public String getHoraFinalGratis() {
		return horaFinalGratis;
	}
	public void setHoraFinalGratis(String horaFinalGratis) {
		this.horaFinalGratis = horaFinalGratis;
	}
	public boolean getRestricao() {
		return restricao;
	}
	public void setRestricao(boolean restricao) {
		this.restricao = restricao;
	}
	public boolean getNaoSegunda() {
		return naoSegunda;
	}
	public void setNaoSegunda(boolean naoSegunda) {
		this.naoSegunda = naoSegunda;
	}
	public boolean getNaoTerca() {
		return naoTerca;
	}
	public void setNaoTerca(boolean naoTerca) {
		this.naoTerca = naoTerca;
	}
	public boolean getNaoQuarta() {
		return naoQuarta;
	}
	public void setNaoQuarta(boolean naoQuarta) {
		this.naoQuarta = naoQuarta;
	}
	public boolean getNaoQuinta() {
		return naoQuinta;
	}
	public void setNaoQuinta(boolean naoQuinta) {
		this.naoQuinta = naoQuinta;
	}
	public boolean getNaoSexta() {
		return naoSexta;
	}
	public void setNaoSexta(boolean naoSexta) {
		this.naoSexta = naoSexta;
	}
	public boolean getNaoSabado() {
		return naoSabado;
	}
	public void setNaoSabado(boolean naoSabado) {
		this.naoSabado = naoSabado;
	}
	public boolean getNaoDomingo() {
		return naoDomingo;
	}
	public void setNaoDomingo(boolean naoDomingo) {
		this.naoDomingo = naoDomingo;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	
	

}
