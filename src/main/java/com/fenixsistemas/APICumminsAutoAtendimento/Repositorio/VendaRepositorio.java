package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;



@Repository
public class VendaRepositorio {

	ConexaoBD conex = new ConexaoBD();
    Script script = new Script();
    
    public boolean inserirVenda(Venda venda) {
    	conex.conexao();
		String sql = script.inserirVenda(venda.getId(),venda.getDataAbertura(),venda.getUsuarioAbertura(), venda.getDataAbertura2(),
				 venda.getDesconto(), venda.getAcrescimo(), venda.getValorTotal(), venda.getTipoVenda(),
				 venda.getNumeroMesa(), venda.getNumeroComanda(), venda.getId(), venda.getIdCaixa());		
        try {
        	conex.executaSql(sql);
        	conex.desconecta();
        	return true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir a venda \n\n" + ex);
            return false;
        }
    }
    
    public int buscarIdProximaVenda() {
    	conex.conexao();
    	String sql = script.buscarIdProximaVenda();
    	conex.executaSql(sql);
    	int id = 0;
    	try {
    		while(conex.rs.next()) {
    			id = conex.rs.getInt("nextval");
    		}
    		conex.desconecta();
			return id;
		} catch (Exception e) {
			return id;
			// TODO: handle exception
		}
    }
    
    public int buscarIdCaixa() {
    	conex.conexao();
    	String sql = script.buscarIdCaixa();
    	conex.executaSql(sql);
    	int id = 0;
    	try {
    		while(conex.rs.next()) {
    			id = conex.rs.getInt("id_caixa");
    		}
    		conex.desconecta();
			return id;
		} catch (Exception e) {
			return id;
			// TODO: handle exception
		}
    }
}
