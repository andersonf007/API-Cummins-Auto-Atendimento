package com.fenixsistemas.APICumminsAutoAtendimento.Script;

public class Script {
	
	public String inserirVenda(Long id,String data,int usuarioAbertura,String dataAbertura2,
			double desconto,double acrecimo,double valorTotal,String tipoVenda,
			int numeroMesa,int numeroComanda,int idVenda,int idCaixa) {
		return String.format("""
				INSERT INTO venda(
            ven_001,
            emp_001,
            ven_002,
            ven_004,  
            cli_001, 
            sit_001, 
            usu_001_1, 
            --usu_001_2, 
            --usu_001_3,  
            dat_001_1, 
            --dat_001_2, 
            --dat_001_3, 
            ven_007, 
            ven_008, 
            ven_009,  
            ven_024, 
            ven_025, 
            ven_023, 
            ven_026, 
            ven_029, 
            nro_pessoas, 
            nro_couvert_m, 
            nro_couvert_f, 
            --cpf_cliente, 
            id_caixa_abertura, 
            b_taxa_entrega, 
            terminal_abertura
            )
    VALUES (
	%d,
	1,
	0,
	%d,
	8,
	%d,
	%s,
	%s,
	%s,
	%s,
	%s,
	%d,
	'N',
	%d
	%d
	1,
	0,
	0,
	%d,
	%d
	TRUE,
	'AUTO ATENDIMENTO'
);
				""",id,data,usuarioAbertura,dataAbertura2,
				desconto,acrecimo,valorTotal,tipoVenda,
				numeroMesa,numeroComanda,idVenda,idCaixa);
	}

	public String inserirVendaItem(int id,int posicaoItem,int idProduto,double quantidade,double valorUnitario,
			double valorTotal,String observacao,int situacao,int idImpressora,int idGarcom,double tamanho,
			boolean vendaTamanho,double quantidadeImpressao,String dataLancamento,boolean gratis) {
		return String.format("""
				INSERT INTO vendaitem(
				            emp_001, 
				            ven_001, 
				            ite_001, 
				            mat_001, 
				            ite_002, 
				            ite_003, 
				            ite_005, 
				            ite_006, 
				            ite_008, 
				            sit_001, 
				            --ite_011, 
				            --ite_012, 
				            ite_013, 
				            gar_001, 
				            desconto, 
				            tamanho, 
				            b_venda_tamanho, 
				            item_fracionado, 
				            acrescimo, 
				            quantidade_impressao, 
				            data_hora_lancamento, 
				            b_70pc_valor_unit, 
				            b_producao, 
				            b_entregue, 
				            --justificativa_cancelamento,
				            b_gratis, 
				            valor_pago_antec, 
				            qtd_paga_antec 
				            --mat_012 
				            --data_hora_cancelamento
				            )
				    VALUES (
						1,
						%d, 
						%d, 
						%d,
						%s,
						%s,
						%s,
						%s,
						'N',
						%d,
						'S',
						'N',
						%d,
						%d,
						0.00,
						%s,
						%s,
						0.00,
						%s,
						%s,
						FALSE,
						TRUE,
						FALSE,
						%s,
						0.00,
						0.00
					);
				""",id,posicaoItem,idProduto,quantidade,valorUnitario,valorTotal,observacao,situacao,
				idImpressora,idGarcom,tamanho,vendaTamanho,quantidadeImpressao,dataLancamento,
				gratis);
	}

	public String buscarIdCaixa() {
		return "SELECT id_caixa FROM caixa where id_situacao = 4;";
	}
	
	public String buscarIdProximaVenda() {
		return "select nextval('venda_ven_001_seq')";
	}
}
