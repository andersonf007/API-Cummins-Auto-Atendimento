package com.fenixsistemas.APICumminsAutoAtendimento.Repositorio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Repository;

import com.fenixsistemas.APICumminsAutoAtendimento.Conexao.ConexaoBD;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Script.Script;

@Repository
public class CategoriaRepositorio {
	ConexaoBD conex = new ConexaoBD();
	Script script = new Script();
	
	public ArrayList<Categoria> buscarCategorias(){
		conex.conexao();
		String sql = script.buscarCategorias();
		ArrayList<Categoria> listaCategoria = new ArrayList<>();
		try {
        	conex.executaSql(sql);
        	while(conex.rs.next()) {
        		Categoria categoria = new Categoria();
        		categoria.setId(conex.rs.getInt("cat_001"));
        		categoria.setDescricao(conex.rs.getString("cat_002"));
        		categoria.setFracionar(conex.rs.getBoolean("b_fracionar"));
        		categoria.setQuantidadeFracionamento(conex.rs.getInt("fracionamento"));
        		listaCategoria.add(categoria);
    		}
        	conex.desconecta();
        	return listaCategoria;
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, "Não foi possivel buscar categoria \n\n" + ex);
            return null;
        }
	}
}
