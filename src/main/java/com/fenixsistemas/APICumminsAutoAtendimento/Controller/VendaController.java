package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@RequestMapping(value = "inserirVenda", method = RequestMethod.POST)
	//public ResponseEntity<Object> inserirVenda(@RequestBody String dados){
	public boolean inserirVenda(@RequestBody String dados){
		Venda venda = new Venda();
		int idCaixa = vendaService.buscarIdCaixa();
		int idVenda = vendaService.buscarIdProximaVenda();
		try {
			if(idCaixa == 0 || idVenda == 0) {
				//return new ResponseEntity<>("error",  HttpStatus.BAD_REQUEST);
			}
			JSONObject obj = new JSONObject(dados);
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		return false;
	}
}
