package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Produto;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;

@Repository
public class ProdutoRepositorio {
	ConexaoBD conex = new ConexaoBD();
	Script script = new Script();
	
	public ArrayList<Produto> buscarProdutos(){
    	conex.conexao();
    	String sql = script.buscarProdutos();
    	conex.executaSql(sql);
    	ArrayList<Produto> listProduto = new ArrayList<>();
    	try {
    		while(conex.rs.next()) {
    			Produto produto = new Produto();
    			produto.setId(conex.rs.getInt("id"));
    			produto.setDescricao(conex.rs.getString("descricao"));
    			produto.setId_unidade(conex.rs.getInt("id_unidade"));
    			produto.setUnidade(conex.rs.getString("unidade"));
    			produto.setPrecoVenda(conex.rs.getDouble("precoVenda"));
    			produto.setSituacao(conex.rs.getInt("situacao"));
    			produto.setId_categoria(conex.rs.getInt("id_categoria"));
    			produto.setCategoria(conex.rs.getString("categoria"));
    			produto.setValorP(conex.rs.getDouble("valorP"));
    			produto.setValorM(conex.rs.getDouble("valorM"));
    			produto.setValorG(conex.rs.getDouble("valorG"));
    			produto.setValorGG(conex.rs.getDouble("valorGG"));
    			produto.setValorE(conex.rs.getDouble("valorE"));
    			produto.setVendaTamanho(conex.rs.getBoolean("vendaTamanho"));
    			produto.setTamanhoPadrao(conex.rs.getString("tamanhoPadrao"));
    			produto.setHappyHourAtivado(conex.rs.getBoolean("happyHourAtivado"));
    			produto.setHappyHourSegunda(conex.rs.getBoolean("happyHourSegunda"));
    			produto.setHappyHourTerca(conex.rs.getBoolean("happyHourTerca"));
    			produto.setHappyHourQuarta(conex.rs.getBoolean("happyHourQuarta"));
    			produto.setHappyHourQuinta(conex.rs.getBoolean("happyHourQuinta"));
    			produto.setHappyHourSexta(conex.rs.getBoolean("happyHourSexta"));
    			produto.setHappyHourSabado(conex.rs.getBoolean("happyHourSabado"));
    			produto.setHappyHourDomingo(conex.rs.getBoolean("happyHourDomingo"));
    			produto.setHappyHourMesa(conex.rs.getBoolean("happyHourMesa"));
    			produto.setHappyHourComanda(conex.rs.getBoolean("happyHourComanda"));
    			produto.setHappyHourInicial(conex.rs.getString("happyHourInicial"));
    			produto.setHappyHourFinal(conex.rs.getString("happyHourFinal"));
    			produto.setHappyHourValor(conex.rs.getDouble("happyHourValor"));
    			produto.setProximoGratis(conex.rs.getBoolean("proximoGratis"));
    			produto.setQuantidadeProximoGratis(conex.rs.getInt("quantidadeProximoGratis"));
    			produto.setSegundaGratis(conex.rs.getBoolean("segundaGratis"));
    			produto.setTercaGratis(conex.rs.getBoolean("tercaGratis"));
    			produto.setQuartaGratis(conex.rs.getBoolean("quartaGratis"));
    			produto.setQuintaGratis(conex.rs.getBoolean("quintaGratis"));
    			produto.setSextaGratis(conex.rs.getBoolean("sextaGratis"));
    			produto.setSabadoGratis(conex.rs.getBoolean("sabadoGratis"));
    			produto.setDomingoGratis(conex.rs.getBoolean("domingoGratis"));
    			produto.setHoraInicialGratis(conex.rs.getString("horaInicialGratis"));
    			produto.setHoraFinalGratis(conex.rs.getString("horaFinalGratis"));
    			produto.setRestricao(conex.rs.getBoolean("restricao"));
    			produto.setNaoSegunda(conex.rs.getBoolean("naoSegunda"));
    			produto.setNaoTerca(conex.rs.getBoolean("naoTerca"));
    			produto.setNaoQuarta(conex.rs.getBoolean("naoQuarta"));
    			produto.setNaoQuinta(conex.rs.getBoolean("naoQuinta"));
    			produto.setNaoSexta(conex.rs.getBoolean("naoSexta"));
    			produto.setNaoSabado(conex.rs.getBoolean("naoSabado"));
    			produto.setNaoDomingo(conex.rs.getBoolean("naoDomingo"));
    			produto.setUrlImagem(conex.rs.getString("urlImagem"));  
    			listProduto.add(produto);
    		}
    		conex.desconecta();
			return listProduto;
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
	}
	
	public ArrayList<Produto> buscarProdutosPorCategoria(int idCategoria){
    	conex.conexao();
    	String sql = script.buscarProdutosPorCategoria(idCategoria);
    	conex.executaSql(sql);
    	ArrayList<Produto> listProduto = new ArrayList<>();
    	try {
    		while(conex.rs.next()) {
    			Produto produto = new Produto();
    			produto.setId(conex.rs.getInt("id"));
    			produto.setDescricao(conex.rs.getString("descricao"));
    			produto.setId_unidade(conex.rs.getInt("id_unidade"));
    			produto.setUnidade(conex.rs.getString("unidade"));
    			produto.setPrecoVenda(conex.rs.getDouble("precoVenda"));
    			produto.setSituacao(conex.rs.getInt("situacao"));
    			produto.setId_categoria(conex.rs.getInt("id_categoria"));
    			produto.setCategoria(conex.rs.getString("categoria"));
    			produto.setValorP(conex.rs.getDouble("valorP"));
    			produto.setValorM(conex.rs.getDouble("valorM"));
    			produto.setValorG(conex.rs.getDouble("valorG"));
    			produto.setValorGG(conex.rs.getDouble("valorGG"));
    			produto.setValorE(conex.rs.getDouble("valorE"));
    			produto.setVendaTamanho(conex.rs.getBoolean("vendaTamanho"));
    			produto.setTamanhoPadrao(conex.rs.getString("tamanhoPadrao"));
    			produto.setHappyHourAtivado(conex.rs.getBoolean("happyHourAtivado"));
    			produto.setHappyHourSegunda(conex.rs.getBoolean("happyHourSegunda"));
    			produto.setHappyHourTerca(conex.rs.getBoolean("happyHourTerca"));
    			produto.setHappyHourQuarta(conex.rs.getBoolean("happyHourQuarta"));
    			produto.setHappyHourQuinta(conex.rs.getBoolean("happyHourQuinta"));
    			produto.setHappyHourSexta(conex.rs.getBoolean("happyHourSexta"));
    			produto.setHappyHourSabado(conex.rs.getBoolean("happyHourSabado"));
    			produto.setHappyHourDomingo(conex.rs.getBoolean("happyHourDomingo"));
    			produto.setHappyHourMesa(conex.rs.getBoolean("happyHourMesa"));
    			produto.setHappyHourComanda(conex.rs.getBoolean("happyHourComanda"));
    			produto.setHappyHourInicial(conex.rs.getString("happyHourInicial"));
    			produto.setHappyHourFinal(conex.rs.getString("happyHourFinal"));
    			produto.setHappyHourValor(conex.rs.getDouble("happyHourValor"));
    			produto.setProximoGratis(conex.rs.getBoolean("proximoGratis"));
    			produto.setQuantidadeProximoGratis(conex.rs.getInt("quantidadeProximoGratis"));
    			produto.setSegundaGratis(conex.rs.getBoolean("segundaGratis"));
    			produto.setTercaGratis(conex.rs.getBoolean("tercaGratis"));
    			produto.setQuartaGratis(conex.rs.getBoolean("quartaGratis"));
    			produto.setQuintaGratis(conex.rs.getBoolean("quintaGratis"));
    			produto.setSextaGratis(conex.rs.getBoolean("sextaGratis"));
    			produto.setSabadoGratis(conex.rs.getBoolean("sabadoGratis"));
    			produto.setDomingoGratis(conex.rs.getBoolean("domingoGratis"));
    			produto.setHoraInicialGratis(conex.rs.getString("horaInicialGratis"));
    			produto.setHoraFinalGratis(conex.rs.getString("horaFinalGratis"));
    			produto.setRestricao(conex.rs.getBoolean("restricao"));
    			produto.setNaoSegunda(conex.rs.getBoolean("naoSegunda"));
    			produto.setNaoTerca(conex.rs.getBoolean("naoTerca"));
    			produto.setNaoQuarta(conex.rs.getBoolean("naoQuarta"));
    			produto.setNaoQuinta(conex.rs.getBoolean("naoQuinta"));
    			produto.setNaoSexta(conex.rs.getBoolean("naoSexta"));
    			produto.setNaoSabado(conex.rs.getBoolean("naoSabado"));
    			produto.setNaoDomingo(conex.rs.getBoolean("naoDomingo"));
    			produto.setUrlImagem(conex.rs.getString("urlImagem"));   
    			listProduto.add(produto);
    		}
    		conex.desconecta();
			return listProduto;
		} catch (Exception e) {
			return null;
			// TODO: handle exception
		}
	}
}
