package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItemOpcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;

@Repository
public class VendaItemOpcionalRepositorio {
	ConexaoBD conex = new ConexaoBD();
    Script script = new Script();
    
    public boolean inserirVendaItemOpcional(VendaItemOpcional vendaItemOpcional) {
    	conex.conexao();
		String sql = script.inserirVendaItemOpcional(vendaItemOpcional);		
        try {
        	conex.executaSql(sql);
        	conex.desconecta();
        	return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os opcionais \n\n" + ex);
            return false;
        }
    }
}
