package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import javax.swing.JOptionPane;
import javax.validation.Valid;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItem;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;

@Repository
public class VendaItemRepositorio {
	ConexaoBD conex = new ConexaoBD();
    Script script = new Script();
    
    public boolean inserirvendaItem(VendaItem vendaItem) {
    	conex.conexao();
		String sql = script.inserirVendaItem(vendaItem.getIdVenda(),vendaItem.getPosicaoItem(),vendaItem.getIdProduto(),
				vendaItem.getQuantidade(), vendaItem.getValorUnitario(),vendaItem.getValorTotal(), vendaItem.getObservacao(),
				vendaItem.getSituacao(),vendaItem.getIdImpressora(), vendaItem.getIdGarcom(), vendaItem.getTamanho(),
				vendaItem.getVendaTamanho(),vendaItem.getQuantidadeImpressao(),vendaItem.getHoraLancamento(),vendaItem.getGratis());		
        try {
        	conex.executaSql(sql);
        	conex.desconecta();
        	return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir a vendaItem \n\n" + ex);
            return false;
        }
    }
}
