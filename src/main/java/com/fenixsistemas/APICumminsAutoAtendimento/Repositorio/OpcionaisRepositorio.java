package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Opcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;

@Repository
public class OpcionaisRepositorio {
	ConexaoBD conex = new ConexaoBD();
	Script script = new Script();
	
	public List<Opcional> buscarOpcionaisDeUmProduto(int idProduto){
		conex.conexao();
		String sql = script.buscarCategorias();
		ArrayList<Opcional> listaOpcional = new ArrayList<>();
		try {
        	conex.executaSql(sql);
        	while(conex.rs.next()) {
        		Opcional opcional = new Opcional();
        		opcional.setId(conex.rs.getInt("id"));
        		opcional.setDescricao(conex.rs.getString("cat_002"));
        		opcional.setValor(conex.rs.getDouble("valor"));
        		opcional.setSituacao(conex.rs.getInt("situacao"));
        		listaOpcional.add(opcional);
    		}
        	conex.desconecta();
        	return listaOpcional;
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não foi possivel buscar categoria \n\n" + ex);
            return null;
        }
	}
}
