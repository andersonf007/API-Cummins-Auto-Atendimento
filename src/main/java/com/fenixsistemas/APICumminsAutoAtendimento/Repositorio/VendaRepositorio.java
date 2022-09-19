package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;



@Repository
public class VendaRepositorio {

	ConexaoBD conex = new ConexaoBD();
    Script script = new Script();
    
    public boolean inserirVenda(id,data,usuarioAbertura, dataAbertura2,
			 desconto, acrecimo, valorTotal, tipoVenda,
			 numeroMesa, numeroComanda, idVenda, idCaixa) {
    	conex.conexao();
		String sql = script.inserirVenda(id,data,usuarioAbertura, dataAbertura2,
				 desconto, acrecimo, valorTotal, tipoVenda,
				 numeroMesa, numeroComanda, idVenda, idCaixa);
		conex.executaSql(sql);
		
        try {
        	while (conex.rs.next()) {
        		
			}
        	conex.desconecta();
        	//return listGarcom;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir a venda \n\n" + ex);
            return null;
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
