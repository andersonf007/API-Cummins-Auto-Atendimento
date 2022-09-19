package com.fenixsistemas.APICumminsAutoAtendimento.Conexao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;
@Component
public class MudarPorta implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {
    
   @Override
   public void customize(TomcatServletWebServerFactory factory) {
	   int porta = 8080;
	   try {
           FileInputStream arquivo = new FileInputStream("/CumminsAutoAtendimento.txt");
           InputStreamReader input = new InputStreamReader(arquivo);
           BufferedReader buffer = new BufferedReader(input);
           String linha;
           do{
               linha = buffer.readLine();
               if(linha != null){
                   String[] palavras = linha.split("#");
                   porta = Integer.parseInt(palavras[3]);
               }                    
           }while(linha != null);
       } catch (Exception ex) {
           JOptionPane.showMessageDialog(null, "Não foi possivel alterar a porta do serviço! " + ex);
       }
       factory.setPort(porta);
   }
}
