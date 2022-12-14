package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItem;
import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.VendaItemOpcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Fachada.Fachada;

@RestController
@RequestMapping("/venda")
public class VendaController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(value = "atualizaVenda", method = RequestMethod.POST)
	public ResponseEntity<String> atualizaVenda(@RequestBody String dados){		
		try {			
			JSONObject obj = new JSONObject(dados);
			int idVenda = obj.getInt("idVenda");
			double desconto = obj.getDouble("desconto");
			double acrescimo = obj.getDouble("acrescimo");
			double valorTotal = obj.getDouble("valorTotal");
			Venda venda = new Venda(idVenda,desconto,acrescimo,valorTotal,idVenda);
			boolean validacao = fachada.atualizaVenda(venda);
			if(validacao) {
				return new ResponseEntity<>("ok", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Error", HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			return new ResponseEntity<>("Error", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/verificarSeAVendaEstaAberta")
	public ResponseEntity<Object> verificarSeAVendaEstaAberta(@RequestParam String numeroMesaComanda, @RequestParam String tipoVenda) {
		Map<String, Object> resp = new HashMap<String, Object>();
		int id = fachada.verificarSeAVendaEstaAberta(Integer.parseInt(numeroMesaComanda), tipoVenda);
		if(id == 0) {
			int idVenda = fachada.abrirVenda(Integer.parseInt(numeroMesaComanda), tipoVenda);
			if(idVenda == 0) {
				resp.put("error", id);
				return new ResponseEntity<Object>(resp, HttpStatus.NO_CONTENT);				
			}else {
				resp.put("id", id);
				return new ResponseEntity<Object>(resp, HttpStatus.OK);
			}
		}else {
			resp.put("id", id);
			return new ResponseEntity<Object>(resp, HttpStatus.OK);
		}
	}

	@GetMapping("/verificarSeAVendaEstaAguardandoPagamento")
	public ResponseEntity<Object> verificarSeAVendaEstaAguardandoPagamento(@RequestParam int numeroMesaComanda,@RequestParam String tipoVenda) {
		int id = fachada.verificarSeAVendaEstaAguardandoPagamento(numeroMesaComanda, tipoVenda);
		Map<String, Object> resp = new HashMap<String, Object>();		 
		if(id == 0) {
			resp.put("error", false);
			return new ResponseEntity<Object>(resp, HttpStatus.NO_CONTENT);
		}else {
			resp.put("id", true);
			return new ResponseEntity<Object>(resp, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "inserirvendaItem", method = RequestMethod.POST)
	public ResponseEntity<Boolean> inserirvendaItem(@RequestParam VendaItem vendaItem) {
		boolean validacao = fachada.inserirvendaItem(vendaItem);
		if(validacao == false) {
			return new ResponseEntity<>(validacao, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(validacao, HttpStatus.OK);
		}
	}
	
	@RequestMapping(value = "inserirVendaItemOpcional", method = RequestMethod.POST)
	public ResponseEntity<Boolean> inserirVendaItemOpcional(VendaItemOpcional vendaItemOpcional){
		boolean validacao = fachada.inserirVendaItemOpcional(vendaItemOpcional);
		if(validacao == false) {
			return new ResponseEntity<>(validacao, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(validacao, HttpStatus.OK);
		}
	}
}
