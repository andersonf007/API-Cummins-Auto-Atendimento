package com.fenixsistemas.APICumminsAutoAtendimento.Conexao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Banco;



public class Leitor {

    Banco banco = new Banco();
	
	public Banco buscarArquivoDeInicializacao() {
		try {
            FileInputStream arquivo = new FileInputStream("/cumminsAutoAtendimento.txt");
            InputStreamReader input = new InputStreamReader(arquivo);
            BufferedReader buffer = new BufferedReader(input);
            String linha;
            do{
                linha = buffer.readLine();
                if(linha != null){
                    String[] palavras = linha.split("#");
                    banco.setServidor(palavras[0]);
                    banco.setPorta(palavras[1]);
                    banco.setBanco(palavras[2]); 
                    banco.setUsuario(palavras[4]);
                    banco.setSenha(palavras[5]);
                }                    
            }while(linha != null);
             return banco;           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não existe arquivo de conexão! " + ex);
            return null;
        }
	}
}
