package com.fenixsistemas.APICumminsAutoAtendimento.Script;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItemOpcional;

public class Script {
	
	public String atualizaVenda(double desconto,double acrescimo,double valorTotal,int idVenda) {
		return "UPDATE venda SET ven_007="+desconto+",ven_008="+acrescimo+", ven_009="+valorTotal+"	WHERE ven_001 = "+idVenda+" RETURNING ven_001;";

	}
	
	public String abrirVenda(int id,String data,String dataAbertura2,
			String tipoVenda,int numeroMesa,int numeroComanda,int idVenda,int idCaixa) {
		return "INSERT INTO venda(ven_001,emp_001,ven_002,ven_004,sit_001,usu_001_1,dat_001_1,ven_007,"
				+ "ven_008, ven_009,ven_024,ven_025,ven_023,ven_026,ven_029,nro_pessoas,nro_couvert_m,nro_couvert_f,"
				+ "id_caixa_abertura,b_taxa_entrega,terminal_abertura)VALUES ("
				+ ""+id+",1,0,"+"\'"+data+"\'"+",8,1,"+"\'"+dataAbertura2+"\'"+","
				+ ""+0.00+","+0.00+","+0.00+","+"\'"+tipoVenda+"\'"+","+numeroMesa+",'N',"+numeroComanda+","
				+ ""+idVenda+",1,0,0,"+idCaixa+",TRUE,'AUTO ATENDIMENTO')RETURNING ven_001;";
	}

	public String inserirVendaItem(Long id,int posicaoItem,Long idProduto,double quantidade,double valorUnitario,
			double valorTotal,String observacao,int situacao,int idImpressora,int idGarcom,String tamanho,
			boolean vendaTamanho,double quantidadeImpressao,String dataLancamento,boolean gratis) {
		return "INSERT INTO vendaitem(emp_001,ven_001,ite_001,mat_001,ite_002,ite_003,ite_005,ite_006,ite_008,sit_001," 
				+ "ite_011,ite_012,ite_013,gar_001,desconto,tamanho,b_venda_tamanho,/*item_fracionado,acrescimo,*/" 
				+ "quantidade_impressao,data_hora_lancamento,b_70pc_valor_unit,b_producao,b_entregue,/*justificativa_cancelamento,*/"
				+ "b_gratis,valor_pago_antec,qtd_paga_antec/*,mat_012,data_hora_cancelamento*/)VALUES ("
				+ ""+1+","+id+","+posicaoItem+","+idProduto+","+quantidade+","+valorUnitario+","+valorTotal+""
				+ ""+observacao+",'N',"+situacao+",'S','S',"+idImpressora+","+idGarcom+",0.00,"+tamanho+","+vendaTamanho+","
				+ ""+quantidadeImpressao+","+dataLancamento+",FALSE,TRUE,FALSE,"+gratis+",0.00,0.00);";
	}

	public String buscarIdCaixa() {
		return "SELECT id_caixa FROM caixa where id_situacao = 4;";
	}
	
	public String buscarIdProximaVenda() {
		return "select nextval('venda_ven_001_seq')";
	}
	
	public String buscarOpcionaisDeUmProduto(int idProduto) {
		return String.format("""
				select
					opcional.id_opcional as id,
					descricao,
					valor,
					id_situacao as situacao
				from opcional join materiais_opcional
				on opcional.id_opcional = materiais_opcional.id_opcional
				where id_material = %d
				order by 
					2
				""",idProduto);
	}

	public String buscarProdutos() {
		return String.format("""
				select
					m.mat_001 as id,
					m.mat_003 as descricao,
					m.uni_001 as id_unidade,	
					u.uni_002 as unidade,
					m.mat_008 as precoVenda,
					m.sit_001 as situacao,
					m.cat_001 as id_categoria,
					c.cat_002 as categoria,
					m.valor_tam_p as valorP,
					m.valor_tam_m as valorM,
					m.valor_tam_g as valorG,
					m.valor_tam_gg as valorGG,
					m.valor_tam_extra as valorE,
					m.b_venda_tamanho as vendaTamanho,
					m.tamanho_padrao as tamanhoPadrao,
					m.hh_ativar as happyHourAtivado,
					m.hh_dia_seg as happyHourSegunda,
					m.hh_dia_ter as happyHourTerca,
					m.hh_dia_qua as happyHourQuarta,
					m.hh_dia_qui as happyHourQuinta,
					m.hh_dia_sex as happyHourSexta,
					m.hh_dia_sab as happyHourSabado,
					m.hh_dia_dom as happyHourDomingo,
					m.hh_tipo_mesa as happyHourMesa,
					m.hh_tipo_comanda as happyHourComanda,
					m.hh_inicial as happyHourInicial,
					m.hh_final as happyHourFinal,
					m.hh_valor as happyHourValor,
					m.b_proximogratis as proximoGratis,
					m.qtdeproximogratis as quantidadeProximoGratis,
					m.seg_gratis as segundaGratis,
					m.ter_gratis as tercaGratis,
					m.qua_gratis as quartaGratis,
					m.qui_gratis as quintaGratis,
					m.sex_gratis as sextaGratis,
					m.sab_gratis as sabadoGratis,
					m.dom_gratis as domingoGratis,
					m.hh_inigratis as horaInicialGratis,
					m.hh_fimgratis as horaFinalGratis,
					m.b_restricao as restricao,
					m.nao_dia_seg as naoSegunda,
					m.nao_dia_ter as naoTerca,
					m.nao_dia_qua as naoQuarta,
					m.nao_dia_qui as naoQuinta,
					m.nao_dia_sex as naoSexta,
					m.nao_dia_sab as naoSabado,
					m.nao_dia_dom as naoDomingo,
					m.url_image as urlImagem
				from materiais m 
				join categoria c
				on m.cat_001 = c.cat_001
				join unidades u 
				on u.uni_001 = m.uni_001
				where
					m.sit_001 = 4
					and auto_atendimento = TRUE
								""");
	}
	
	public String buscarProdutosPorCategoria(int idCategoria) {
		return String.format("""
				select
					m.mat_001 as id,
					m.mat_003 as descricao,
					m.uni_001 as id_unidade,	
					u.uni_002 as unidade,
					m.mat_008 as precoVenda,
					m.sit_001 as situacao,
					m.cat_001 as id_categoria,
					c.cat_002 as categoria,
					m.valor_tam_p as valorP,
					m.valor_tam_m as valorM,
					m.valor_tam_g as valorG,
					m.valor_tam_gg as valorGG,
					m.valor_tam_extra as valorE,
					m.b_venda_tamanho as vendaTamanho,
					m.tamanho_padrao as tamanhoPadrao,
					m.hh_ativar as happyHourAtivado,
					m.hh_dia_seg as happyHourSegunda,
					m.hh_dia_ter as happyHourTerca,
					m.hh_dia_qua as happyHourQuarta,
					m.hh_dia_qui as happyHourQuinta,
					m.hh_dia_sex as happyHourSexta,
					m.hh_dia_sab as happyHourSabado,
					m.hh_dia_dom as happyHourDomingo,
					m.hh_tipo_mesa as happyHourMesa,
					m.hh_tipo_comanda as happyHourComanda,
					m.hh_inicial as happyHourInicial,
					m.hh_final as happyHourFinal,
					m.hh_valor as happyHourValor,
					m.b_proximogratis as proximoGratis,
					m.qtdeproximogratis as quantidadeProximoGratis,
					m.seg_gratis as segundaGratis,
					m.ter_gratis as tercaGratis,
					m.qua_gratis as quartaGratis,
					m.qui_gratis as quintaGratis,
					m.sex_gratis as sextaGratis,
					m.sab_gratis as sabadoGratis,
					m.dom_gratis as domingoGratis,
					m.hh_inigratis as horaInicialGratis,
					m.hh_fimgratis as horaFinalGratis,
					m.b_restricao as restricao,
					m.nao_dia_seg as naoSegunda,
					m.nao_dia_ter as naoTerca,
					m.nao_dia_qua as naoQuarta,
					m.nao_dia_qui as naoQuinta,
					m.nao_dia_sex as naoSexta,
					m.nao_dia_sab as naoSabado,
					m.nao_dia_dom as naoDomingo,
					m.arquivo_img as urlImagem
				from materiais m 
				join categoria c
				on m.cat_001 = c.cat_001
				join unidades u 
				on u.uni_001 = m.uni_001
				where
					m.sit_001 = 4
					and auto_atendimento = TRUE
					and m.cat_001 = %d
				""",idCategoria);
	}
	
	public String verificarSeAVendaEstaAberta(int idMesaComanda, String tipoVenda) {
		return String.format("""
				SELECT
					ven_001 
				from venda
				where
					sit_001 = 8
					and (ven_015 = 0 or ven_015 is null) -- nao esta aguardando liberacao
					and ven_024 = %s
					and ven_025 = %d 
				""","\'"+tipoVenda+"\'",idMesaComanda);
	}
	
	public String verificarSeAVendaEstaAguardandoPagamento(int idMesaComanda, String tipoVenda) {
		return String.format("""
				SELECT
					ven_001 
				from venda
				where
					sit_001 = 21
					and ven_024 = %s
					and ven_025 = %d 
				""","\'"+tipoVenda+"\'",idMesaComanda);
	}

	public String buscarCategorias() {
		return String.format("""
				select 
					distinct
					m.cat_001,
					c.cat_002,
					c.b_fracionar,
					c.fracionamento
				from materiais m
				inner join categoria c
				on c.cat_001 = m.cat_001
				where
					m.auto_atendimento = true
				order by
					c.cat_002
				""");
	}

	public String inserirVendaItemOpcional(VendaItemOpcional vendaItemOpcional) {
		return "INSERT INTO vendaitemopcional(id_venda, id_empresa, id_vendaitem, id_opcional, gratis, naofracionar)"
				+ "VALUES ("+vendaItemOpcional.getIdVenda()+", 1, "+vendaItemOpcional.getPossicaoProdutoVendaItem()+","
				+ " "+vendaItemOpcional.getIdOpcional()+", "+vendaItemOpcional.getGratis()+", "+vendaItemOpcional.getNaoFracionar()+");";
	}
}
